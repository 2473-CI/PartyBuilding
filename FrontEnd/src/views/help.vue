<template>

	<el-button type="primary" :icon="CirclePlus" circle @click="addMes" style="position: absolute;right:10px;z-index: 10;"/>
	
	
  <el-table :data="tableData" style="width: 100%" >
    <el-table-column label="帮扶者姓名" width="130">
		<template #default="scope">
		  <p v-show="modifyTable[scope.$index] == 1">{{scope.row.helpername}}</p>
		   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.helpername"></el-input>
		</template>
	</el-table-column>
    <el-table-column label="帮扶者党支部" width="200">
		<template #default="scope">
		  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.helperbelongto}}</p>
		   <el-input disabled v-show="modifyTable[scope.$index] != 1" v-model="scope.row.helperbelongto"></el-input>
		</template>
	</el-table-column>
    <el-table-column label="帮扶者地址" width="200">
		<template #default="scope">
		  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.helperaddress}}</p>
		   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.helperaddress"></el-input>
		</template>
    </el-table-column>
    <el-table-column label="帮扶者身份证" width="120">
		<template #default="scope">
		  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.helpercard}}</p>
		  <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.helpercard"></el-input>
		</template>
		</el-table-column>
		<el-table-column label="帮扶者党员号" width="200">
			<template #default="scope">
			  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.helperpartyid}}</p>
			   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.helperpartyid"></el-input>
			</template>
		</el-table-column>
		<el-table-column label="帮扶对象" width="200">
			<template #default="scope">
			  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.helpobject}}</p>
			   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.helpobject"></el-input>
			</template>
		</el-table-column>
		<el-table-column label="帮扶对象地址" width="200">
			<template #default="scope">
			  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.helpobjectadress}}</p>
			   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.helpobjectadress"></el-input>
			</template>
		</el-table-column>
		<el-table-column label="帮扶对象身份证" width="200">
			<template #default="scope">
			  <p  v-show="modifyTable[scope.$index] == 1">{{scope.row.helpobjectcard}}</p>
			   <el-input v-show="modifyTable[scope.$index] != 1" v-model="scope.row.helpobjectcard"></el-input>
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
  <div style="position: absolute;bottom: 10px;left:45%">
  <el-pagination  v-model:current-page="changePage.currentPage" background  :total="changePage.total" @current-change="currentChange"  layout="prev, pager, next" />
 </div>
</template>

<script setup>
import {findHelpList,addHelp,updateHelp,deleteHelp} from '../api/HelpAPI.js'
	import {
	 CirclePlus
	} from '@element-plus/icons-vue'
import {onMounted,ref,reactive} from 'vue'
import { ElMessage } from 'element-plus'

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


const handleClick = (scope,index) => {
	if(index == 1){
		 modifyTable.value[scope.$index] = 2
	}else if(index == 2){
		updateHelp(scope.row).then(res=>{
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
		addHelp(scope.row).then(res=>{
			if(res.code == 200){
				getList()
				 modifyTable.value[scope.$index] = 1
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
         deleteHelp(scope.row).then(res=>{
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


const getList = () =>{
	findHelpList({helperbelongto:JSON.parse(localStorage.getItem('token')).belongto},{page:changePage.currentPage,size:10}).then(res=>{
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
		helperbelongto:JSON.parse(localStorage.getItem('token')).belongto,
		
		
	
	
})

const tableData = ref([])

const modifyTable = ref([])
</script>
