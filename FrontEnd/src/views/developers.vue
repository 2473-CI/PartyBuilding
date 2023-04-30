<template>
  <el-table :data="tableData" style="width: 100%" >
    <el-table-column label="姓名" width="120">
		<template #default="scope">
		  <p>{{scope.row.to.name}}</p>
		</template>
		</el-table-column>
		<el-table-column label="电话" width="120">
			<template #default="scope">
			  <p>{{scope.row.to.phone}}</p>
			</template>
			</el-table-column>
			<el-table-column label="职务" width="120">
				<template #default="scope">
				  <p>{{scope.row.to.role}}</p>
				</template>
				</el-table-column>
				<el-table-column label="培养人" width="130">
					<template #default="scope">
					  <p>{{scope.row.from.name}}</p>
					</template>
				</el-table-column>
				<el-table-column label="培养人电话" width="200">
					<template #default="scope">
					  <p >{{scope.row.from.phone}}</p>
					</template>
				</el-table-column>
				<el-table-column label="培养人职务" width="200">
					<template #default="scope">
					  <p>{{scope.row.from.role}}</p>
					</template>
				</el-table-column>
				<el-table-column label="创建时间" width="200">
					<template #default="scope">
					  <p>{{scope.row.createTime}}</p>
					</template>
					</el-table-column>
    <el-table-column fixed="right" label="操作" width="120">
      <template #default="scope">
   <!--     <el-button link type="primary" size="small" @click="handleClick(scope,1)"
          v-show="modifyTable[scope.$index] == 1">编辑</el-button
        >
		<el-button link type="primary" size="small" @click="handleClick(scope,2)"
		  v-show="modifyTable[scope.$index] == 2">保存</el-button
		>
		<el-button link type="primary" size="small" @click="handleClick(scope,3)"
		  v-show="modifyTable[scope.$index] == 3">确认</el-button
		> -->
        <el-button link type="primary" size="small" @click="deleteClick(scope)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
  <div style="position: absolute;bottom: 10px;left:45%">
  <el-pagination  v-model:current-page="changePage.currentPage" background  :total="changePage.total" @current-change="currentChange"  layout="prev, pager, next" />
 </div>
</template>

<script setup>
import {findDevelopersList,deleteDeveloper} from '../api/Developers.js'
import {timeSolve} from '../Utils/TimeUtil.js'
import {onMounted,ref,reactive} from 'vue'
import { ElMessage } from 'element-plus'
import {addAndUpdateUser} from '../api/UserApi.js'

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


const deleteClick = (scope) => {
         deleteDeveloper({id:scope.row.id}).then(res=>{
         	if(res.code == 200){
				//删除后该用户职务更新为市民
				scope.row.to.role = "市民"
				addAndUpdateUser(scope.row.to).then(sres=>{
					console.log(sres)
				})
				
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

const addMes = () => {
	modifyTable.value.push(3)
	tableData.value.push(JSON.parse(JSON.stringify(obj)))
	
}


const getList = () =>{
	findDevelopersList( JSON.parse(localStorage.getItem('token')),{page:changePage.currentPage,size:10}).then(res=>{
		console.log(res)
		if(res.code == 200){
			res.data.forEach((item)=>{
				item.createTime = timeSolve(item.createTime)
			})
			
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
	createTime:'',
	from:'',
	to:{
		belongto:'',
		email:'',
		identitycard:'',
		name:'',
		partyid:'',
		phone:'',
		role:'',
		username:''
	}
	
	
	
})

const tableData = ref([])

const modifyTable = ref([])
</script>
