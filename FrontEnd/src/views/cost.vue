<template>
	 <el-select v-model="value" placeholder="Select" @change="getList">
	    <el-option
	      v-for="item in options"
	      :key="item.value"
	      :label="item.label"
	      :value="item.value"
	      :disabled="item.disabled"
	    />
	  </el-select>
	 <el-button type="primary" :icon="CirclePlus" circle :disabled="value == '缴费完成' ||  grade > 2" @click="dialogVisible = true" style="position: absolute;right:10px;z-index: 10;"/>
  <el-dialog
      v-model="dialogVisible"
      title="创建缴费"
      width="30%"
      :before-close="handleClose"
    >
    <el-input v-model="belongto" disabled />
   缴费金额：<el-input-number style="margin-top: 15px;" v-model="costnumber" :min="1" :max="10000" />
      <template #footer>
        <span class="dialog-footer">
          <el-button @click="dialogVisible = false">取消</el-button>
          <el-button type="primary" @click="confirmBox">
            确认
          </el-button>
        </span>
      </template>
    </el-dialog>
  
  <el-table :data="tableData" style="width: 100%" >
    <el-table-column label="姓名" width="130">
		<template #default="scope">
		  <p>{{scope.row.name}}</p>
		</template>
	</el-table-column>
    <el-table-column label="党支部" width="200">
		<template #default="scope">
		  <p>{{scope.row.belongto}}</p>
		</template>
	</el-table-column>
    <el-table-column label="缴费金额" width="120">
		<template #default="scope">
		  <p>{{scope.row.costnumber}}</p>
		</template>
    </el-table-column>
    <el-table-column label="创建时间" width="200">
		<template #default="scope">
		  <p>{{scope.row.createtime}}</p>
		</template>
		</el-table-column>
		<el-table-column label="状态" width="120">
			<template #default="scope">
			  <p>{{scope.row.status}}</p>
			</template>
			</el-table-column>

    <el-table-column fixed="right" label="操作" width="120">
      <template #default="scope">
        <el-button link type="primary" size="small" @click="handleClick(scope)"
          v-show="value != '缴费完成'" :disabled="grade > 2">确认缴费</el-button
        >


      </template>
    </el-table-column>
  </el-table>
<div style="position: absolute;bottom: 10px;left:45%">
  <el-pagination  v-model:current-page="changePage.currentPage" background  :total="changePage.total" @current-change="currentChange"  layout="prev, pager, next" />
 </div>
</template>

<script setup>
import {findVolunteerList,updateVolunteer,deleteVolunteer} from '../api/VolunteerAPI.js'
import {findCostList,addCost,payIt} from '../api/CostAPI.js'
import {timeSolve} from '../Utils/TimeUtil.js'
import {onMounted,ref,reactive} from 'vue'
import { ElMessage,ElMessageBox  } from 'element-plus'
import {getRoles} from '../api/RoleAPI.js'
import {
 CirclePlus
} from '@element-plus/icons-vue'
const size = ref<'default' | 'large' | 'small'>('default')
const dialogVisible = ref(false)
const changePage = reactive({
  currentPage: 1,
  total: 0,
});




const currentChange = (val) => {
	getList()
}



const handleClose = (done) => {
  ElMessageBox.confirm('确定取消吗？')
    .then(() => {
     done()
    })
    .catch(() => {
      // catch error
    })
}

const shortcuts = [
  {
    text: 'Today',
    value: new Date(),
  },
  {
    text: 'Yesterday',
    value: () => {
      const date = new Date()
      date.setTime(date.getTime() - 3600 * 1000 * 24)
      return date
    },
  },
  {
    text: 'A week ago',
    value: () => {
      const date = new Date()
      date.setTime(date.getTime() - 3600 * 1000 * 24 * 7)
      return date
    },
  },
]

const disabledDate = (time) => {
  return time.getTime() > Date.now()
}
onMounted(()=>{
	getRoleList()
	getList()
	
})

const getRoleList = ()=>{
	getRoles().then(res => {
		
		for(var i = 0;i<res.data.length;i++){
			if(res.data[i].rolename  == role._value){
				grade._value = res.data[i].rolegrade
				break
			}
		}
	})
}

const grade = ref()

const handleClick = (scope) => {
	
		scope.row.createtime = new Date(scope.row.createtime).toISOString()
		payIt(scope.row).then(res=>{
			if(res.code == 200){
                 getList()
				ElMessage({
				   message: res.data,
				   type: 'success',
				 })
			}else{
				ElMessage({
				   message: '服务器错误',
				   type: 'error',
				 })
			}
		})
}

const confirmBox = ()=>{
	addCost({belongto:belongto._value,costnumber:costnumber._value}).then(res=>{
		if(res.code == 200){
			dialogVisible.value = false
			getList()
			ElMessage({
			   message: res.data,
			   type: 'success',
			 })
		}else{
			ElMessage({
			   message: '服务器错误',
			   type: 'error',
			 })
		}
	})
}



const getList = () =>{
	findCostList({status:value.value,belongto:JSON.parse(localStorage.getItem('token')).belongto},{page:changePage.currentPage,size:10}).then(res=>{
		if(res.code == 200){
			res.data.forEach((item)=>{
				item.createtime = timeSolve(item.createtime)

				
			})
			changePage.total = res.size
			tableData.value = res.data
		   
		}else{
			ElMessage({
			   message: '服务器错误',
			   type: 'error',
			 })
		}
	})
}

const options = ref([
	 {
	    value: '缴费完成',
	    label: '缴费完成',
	  },
	{
	   value: '待缴费',
	   label: '待缴费',
	 },
])

const costnumber = ref(1)

const belongto = ref(JSON.parse(localStorage.getItem('token')).belongto)

const value = ref('缴费完成')

const role = ref(JSON.parse(localStorage.getItem('token')).role)

const tableData = ref([])

</script>

<style scoped>
	.demo-datetime-picker {
	  display: flex;
	  width: 100%;
	  padding: 0;
	  flex-wrap: wrap;
	}
	.demo-datetime-picker .block {
	  padding: 30px 0;
	  text-align: center;
	  border-right: solid 1px var(--el-border-color);
	  flex: 1;
	}
	.demo-datetime-picker .block:last-child {
	  border-right: none;
	}
	.demo-datetime-picker .demonstration {
	  display: block;
	  color: var(--el-text-color-secondary);
	  font-size: 14px;
	  margin-bottom: 20px;
	}
</style>