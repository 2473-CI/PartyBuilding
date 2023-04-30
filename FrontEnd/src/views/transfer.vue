<template>
	 <el-button type="primary" v-if="value == '本支部发起转接查询' && role == '分团委老师'" :icon="CirclePlus" circle  @click="addMes" style="position: absolute;right:10px;z-index: 10;"/>
	 <el-dialog
	    v-model="dialogVisible"
	    title="Tips"
	    width="30%"
	    :before-close="handleClose"
	  >
	   
	   <el-select v-model="userValue" placeholder="选择转接人" @change="changeIt">
	      <el-option
	        v-for="item in userOptions"
	        :key="item"
	        :label="'姓名：' + item.name + ' 身份证：' + item.identitycard"
	        :value="JSON.stringify(item)"
	      />
	    </el-select>

		<el-input placeholder="填写接收党支部" v-model="tobelongto"></el-input>
		<el-input placeholder="填写接收人" v-model="recipient"></el-input>
	    <template #footer>
	      <span class="dialog-footer">
	        <el-button @click="dialogVisible = false">取消</el-button>
	        <el-button type="primary" @click="submitIt">
	          创建
	        </el-button>
	      </span>
	    </template>
	  </el-dialog>
	
	
	 <el-select v-model="value" placeholder="Select" @change="changeIt" v-if="role == '分团委老师'">
	    <el-option
	      v-for="item in options"
	      :key="item"
	      :label="item"
	      :value="item"
	    />
	  </el-select>
	
  <el-table :data="tableData" style="width: 100%" v-if="role == '分团委老师'">
	<el-table-column prop="name" label="姓名" width="180"/>
    <el-table-column prop="frombelongto" label="转接前党支部" width="180" />
    <el-table-column prop="tobelongto" label="接收党支部" width="180" />
   <el-table-column prop="initiator" label="发起人" width="180" />
   <el-table-column prop="recipient" label="接收人" width="180" />
    <el-table-column prop="status" label="状态" width="180" />
   <el-table-column prop="createtime" label="创建时间" width="180" />
   <el-table-column prop="updatetime" label="更新时间" width="180" />
  <el-table-column fixed="right" label="操作" width="120">
        <template #default="scope">
          <el-button link type="primary" size="small" @click="passClick(scope)"
            v-if="value == '接收支部转接查询'">通过</el-button>
          <el-button link type="primary" v-if="value == '接收支部转接查询'" size="small" @click="noPass(scope)"
            >拒绝</el-button>
        </template>
		</el-table-column>
  </el-table>
  <div style="position: absolute;bottom: 10px;left:45%">
   <el-pagination  v-model:current-page="changePage.currentPage" background  :total="changePage.total" @current-change="currentChange"  layout="prev, pager, next" />
  </div>
</template>

<script lang="ts" setup>
	import {ref,onMounted,reactive} from 'vue'
	import {addTransfer,findStartTransfer,findPendingApproval,approval} from '../api/TransferAPI.js'
	import {timeSolve} from '../Utils/TimeUtil.js'
	import { ElMessage } from 'element-plus'
	import {
	 CirclePlus
	} from '@element-plus/icons-vue'
	import {findAccountList,addAndUpdateUser,getMes} from '../api/UserApi.js'
	 
	import { ElMessageBox } from 'element-plus'
	
	
	const changePage = reactive({
	  currentPage: 1,
	  total: 0,
	});
	
	
	
	
	const currentChange = (val) => {
		getList()
	}
	
	
	
	const dialogVisible = ref(false)
	
	const handleClose = (done: () => void) => {
	  ElMessageBox.confirm('Are you sure to close this dialog?')
	    .then(() => {
	      done()
	    })
	    .catch(() => {
	      // catch error
	    })
	}
	const value = ref('本支部发起转接查询')
	const userValue = ref()
	const options = [
	  "本支部发起转接查询",
	  "接收支部转接查询"
	  
	]
	
	const userOptions = ref([])
	const tobelongto = ref('')
	const recipient = ref('')
	const noPass = (scope) => {
		scope.row.status = '拒绝转接'
		scope.row.createtime = new Date(scope.row.createtime)
		scope.row.updatetime = new Date()
		approval(scope.row).then(res=>{
			if(res.code == 200){
				ElMessage.success(res.data)
				findPendingList()
			}else{
				ElMessage.error("服务器错误")
			}
		})
	}
	
	
	const passClick = (scope) => {
		scope.row.status = '转接成功'
		scope.row.createtime = new Date(scope.row.createtime)
		scope.row.updatetime = new Date()
		approval(scope.row).then((res)=>{
			
			
			if(res.code == 200){
				
				getMes({id:scope.row.userid}).then(res => {
					res.data.belongto = JSON.parse(localStorage.getItem('token')).belongto
					addAndUpdateUser(res.data).then(res => {
						console.log(res)
					})
				})
				
				ElMessage.success(res.data)
				findPendingList()
				
				
				
			}else{
				ElMessage.error("服务器错误")
			}
		})
	}
	
	const addMes = () => {
		findAccountList(JSON.parse(localStorage.getItem('token'))).then(res=>{
			if(res.code == 200){
				userOptions.value = res.data
				dialogVisible.value = true
				
			}else{
				ElMessage.error("创建失败")
			}
		})
	}
	

	
	const submitIt = () => {
		addTransfer({
		frombelongto:JSON.parse(localStorage.getItem('token')).belongto,
		tobelongto:tobelongto.value,
		userid:JSON.parse(userValue.value).id,
		name:JSON.parse(userValue.value).name,
		initiator:JSON.parse(localStorage.getItem('token')).name,
		recipient:recipient.value,
		status:'待审批',
		createtime:new Date()
		
		}).then(res=>{
			if(res.code == 200){
				dialogVisible.value = false
				findStartList()
				ElMessage.success(res.data)
			}else{
				ElMessage.error("创建失败")
			}
		})
	}
	
	const changeIt = () => {
		if(value.value == "本支部发起转接查询"){
			findStartList()
		}else if(value.value == "接收支部转接查询"){
			findPendingList()
		}
		
	}
	
	onMounted(()=>{
		findStartList()
	})
	
	const findStartList = () =>{
		findStartTransfer({frombelongto:JSON.parse(localStorage.getItem('token')).belongto},{page:changePage.currentPage,size:10}).then(res=>{
			res.data.forEach((item)=>{
				item.createtime = timeSolve(item.createtime)
				if(item.updatetime){
					item.updatetime = timeSolve(item.updatetime)
				}
			})
			changePage.total = res.size
			tableData.value = res.data
		})
	}
	
	const findPendingList = () => {
		findPendingApproval({tobelongto:JSON.parse(localStorage.getItem('token')).belongto},{page:changePage.currentPage,size:10}).then(res=>{
			res.data.forEach((item)=>{
				item.createtime = timeSolve(item.createtime)
				if(item.updatetime){
					item.updatetime = timeSolve(item.updatetime)
				}
			})
			changePage.total = res.size
			tableData.value = res.data
		})
	}
	
	
	const role = ref(JSON.parse(localStorage.getItem('token')).role)
const tableData = ref([])
</script>

<style scoped>
	.dialog-footer button:first-child {
	  margin-right: 10px;
	}
</style>