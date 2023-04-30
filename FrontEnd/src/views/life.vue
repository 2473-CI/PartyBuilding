<template>

	 <el-button type="primary"  v-if="role == '分团委老师'" :icon="CirclePlus" circle :disabled="role != '分团委老师'" @click="addMes" style="position: absolute;right:10px;z-index: 10;"/>

  <el-table :data="tableData" style="width: 100%" v-if="role == '分团委老师'">
    <el-table-column label="党组织" width="130">
		<template #default="scope">
		  <p v-show="modifyTable[scope.$index] == 1">{{scope.row.belongto}}</p>
		   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.belongto"></el-input>
		</template>
	</el-table-column>
    <el-table-column label="标题" width="200">
		<template #default="scope">
		  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.lifetitle}}</p>
		   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.lifetitle"></el-input>
		</template>
	</el-table-column>
    <el-table-column label="简介" width="200">
		<template #default="scope">
		  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.lifesubtitle}}</p>
		   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.lifesubtitle"></el-input>
		</template>
    </el-table-column>
    <el-table-column label="内容" width="120">
		<template #default="scope">
		  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.lifecontext}}</p>
		  <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.lifecontext"></el-input>
		</template>
		</el-table-column>
    <el-table-column fixed="right" label="操作" width="120">
      <template #default="scope">
        <el-button link type="primary" size="small" @click="handleClick(scope,1)"
          v-show="modifyTable[scope.$index] == 1">编辑</el-button
        >
		<el-button link type="primary" size="small" @click="handleClick(scope,2)"
		  v-show="modifyTable[scope.$index] == 2">保存</el-button
		>
		<el-button link type="primary" size="small" @click="handleClick(scope,3)"
		  v-show="modifyTable[scope.$index] == 3">确认</el-button
		>
        <el-button link type="primary" size="small" @click="deleteClick(scope)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
 
<div style="width: 100%;display: flex;flex-wrap: wrap;align-content: flex-start;" v-if="role != '分团委老师'">
<div v-for="(item,index) in tableData" :key="index"  style="width: 280px;border: 1px solid rgba(80,80,80,0.3);padding:5px;height:140px;position: relative;
box-shadow: 5px 5px 5px rgba(80,80,80,0.5);margin: 1%;cursor: pointer;
border-radius: 10px;" @click="openIt(item)">
  <p style="text-align: center;font-size: 25px;font-weight: bold;">{{item.lifetitle}}</p>
  <p style="text-align: center;font-size: 15px;font-weight: bold;">{{item.lifesubtitle}}</p>
  <p style="display:-webkit-box;text-overflow:ellipsis;overflow:hidden;-webkit-line-clamp:2;
					-webkit-box-orient:vertical;">{{item}}{{item}}</p>
  <div style="display: flex;align-items: center;position: absolute;bottom: 1%;right: 2%;"><img src="../assets/image/dh.png" style="width: 30px;"/><p>{{item.belongto}}</p>
  </div>

</div>
</div>
<el-dialog
    v-model="dialogVisible"
    title="组织生活"
    width="30%"
    :before-close="handleClose"
  >
  <p style="text-align: center;font-size: 25px;font-weight: bold;">{{openItem.value.lifetitle}}</p>
   <p style="text-align: center;font-size: 15px;font-weight: bold;">{{openItem.value.lifesubtitle}}</p>
   <p style="">{{openItem}}{{openItem}}{{openItem}}{{openItem}}{{openItem}}{{openItem}}</p>
   <div style="display: flex;align-items: center;position: absolute;bottom: 60px;right: 2%;"><img src="../assets/image/dh.png" style="width: 30px;"/><p>{{openItem.value.belongto}}</p>
   </div>
    <template #footer>
         <span class="dialog-footer">
           <el-button type="primary" @click="dialogVisible = false">
            关闭
           </el-button>
         </span>
       </template>
  </el-dialog>
  <div style="position: absolute;bottom: 10px;left:45%">
   <el-pagination  v-model:current-page="changePage.currentPage" background  :total="changePage.total" @current-change="currentChange"  layout="prev, pager, next" />
  </div>


</template>

<script setup>
import {findLifeList,addLife,updateLife,deleteLife} from '../api/LifeAPI.js'
	import {
	 CirclePlus
	} from '@element-plus/icons-vue'
import {onMounted,ref,reactive} from 'vue'
import { ElMessage,ElMessageBox  } from 'element-plus'

onMounted(()=>{
	getList()
	
})
const changePage = reactive({
  currentPage: 1,
  total: 0,
});
const currentChange = (val) => {
	getList()
}

const dialogVisible = ref(false)

const openItem = reactive({})

const openIt = (item)=>{
	dialogVisible.value = true
	openItem.value = item
	console.log(openItem.value)
}

const handleClose = (done) => {
  ElMessageBox.confirm('确认关闭吗？')
    .then(() => {
      done()
    })
    .catch(() => {
      // catch error
    })
}

const handleClick = (scope,index) => {
	if(index == 1){
		 modifyTable.value[scope.$index] = 2
	}else if(index == 2){
		updateLife(scope.row).then(res=>{
			if(res.code == 200){

				 modifyTable.value[scope.$index] = 1
				ElMessage({
				   message: '添加成功',
				   type: 'success',
				 })
			}else{
				ElMessage({
				   message: '服务器错误',
				   type: 'error',
				 })
			}
		})
	}else{
		addLife(scope.row).then(res=>{
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
}

const deleteClick = (scope) => {
	if(modifyTable.value[scope.$index] == 3){
		modifyTable.value.splice(scope.$index,1)
		tableData.value.splice(scope.$index,1)
		ElMessage({
		   message: '删除成功',
		   type: 'success',
		 })
	}else{
         deleteLife(scope.row).then(res=>{
         	if(res.code == 200){
				modifyTable.value.splice(scope.$index,1)
				tableData.value.splice(scope.$index,1)
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
        
	
}

const addMes = () => {
	modifyTable.value.push(3)
	tableData.value.push(JSON.parse(JSON.stringify(obj)))
	
}
const role = ref(JSON.parse(localStorage.getItem('token')).role)

const getList = () =>{
	findLifeList( JSON.parse(localStorage.getItem('token')),{page:changePage.currentPage,size:10}).then(res=>{
		if(res.code == 200){
			changePage.total = res.size
			tableData.value = res.data
			modifyTable.value = []
			tableData.value.forEach(()=>{
				modifyTable.value.push(1)
			})
			console.log(modifyTable.value)
		}else{
			ElMessage({
			   message: '服务器错误',
			   type: 'error',
			 })
		}
	})
}

const obj = reactive({
	belongto:'',
	lifecontext:'',
	identitycard:'',
	lifesubtitle:'',
	lifetitle:'',
	
	
})

const tableData = ref([])

const modifyTable = ref([])
</script>
