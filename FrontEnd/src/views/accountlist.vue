<template>


	 <el-button type="primary" :icon="CirclePlus" circle  @click="addMes" style="position: absolute;right:10px;z-index: 10;"/>

	
  <el-table :data="tableData" style="width: 100%" >
    <el-table-column label="姓名" width="100">
		<template #default="scope">
		  <p v-show="!modifyTable[scope.$index]">{{scope.row.name}}</p>
		  <el-input v-show="modifyTable[scope.$index]" v-model="scope.row.name"></el-input>
		</template>
	</el-table-column>
    <el-table-column label="党组织" width="130">
		<template #default="scope">
		  <p v-show="!modifyTable[scope.$index]">{{scope.row.belongto}}</p>
		   <el-input v-show="modifyTable[scope.$index]" v-model="scope.row.belongto" disabled></el-input>
		</template>
	</el-table-column>
    <el-table-column label="身份证" width="200">
		<template #default="scope">
		  <p  v-show="!modifyTable[scope.$index]">{{scope.row.identitycard}}</p>
		   <el-input v-show="modifyTable[scope.$index]" v-model="scope.row.identitycard"></el-input>
		</template>
	</el-table-column>
    <el-table-column label="党员号" width="200">
		<template #default="scope">
		  <p  v-show="!modifyTable[scope.$index]">{{scope.row.partyid}}</p>
		   <el-input v-show="modifyTable[scope.$index]" v-model="scope.row.partyid"></el-input>
		</template>
    </el-table-column>
    <el-table-column label="手机" width="120">
		<template #default="scope">
		  <p  v-show="!modifyTable[scope.$index]">{{scope.row.phone}}</p>
		  <el-input v-show="modifyTable[scope.$index]" v-model="scope.row.phone"></el-input>
		</template>
		</el-table-column>
	 <el-table-column label="邮箱" width="180">
		 <template #default="scope">
		   <p v-show="!modifyTable[scope.$index]">{{scope.row.email}}</p>
		   <el-input v-show="modifyTable[scope.$index]" v-model="scope.row.email"></el-input>	   
		 </template>
		 </el-table-column>
		 <el-table-column label="密码" width="180">
		 		 <template #default="scope">
		 		   <p v-show="!modifyTable[scope.$index]">{{scope.row.password}}</p>
		 		<el-input v-show="modifyTable[scope.$index]" v-model="scope.row.password"></el-input>
				 </template>
		 		 </el-table-column>
				 <el-table-column label="职务" width="180">
				 		 <template #default="scope">
				 		   <p v-show="!modifyTable[scope.$index]">{{scope.row.role}}</p>
						   <el-select v-model="scope.row.role" placeholder="Select" v-show="modifyTable[scope.$index]">
						       <el-option
						         v-for="item in roleList"
						         :key="item"
						         :label="item"
						         :value="item"
						       />
						     </el-select>
				 				 </template>
				 		 </el-table-column>
				 <el-table-column label="用户名" width="180">
				 		 <template #default="scope">
				 		   <p v-show="!modifyTable[scope.$index]">{{scope.row.username}}</p>
				 		<el-input v-show="modifyTable[scope.$index]" v-model="scope.row.username"></el-input>
				 				 </template>
				 		 </el-table-column>
			
    <el-table-column fixed="right" label="操作" width="120">
      <template #default="scope">
        <el-button link type="primary" size="small" @click="handleClick(scope)"
          v-show="!modifyTable[scope.$index]" :disabled="user.role != '超级管理员' && user.id != scope.row.id && (scope.row.role =='基层支部书记'|| scope.row.role == '分团委老师' || scope.row.role == '超级管理员')  || user.role == '超级管理员' && scope.row.role == '超级管理员' && user.id != scope.row.id">编辑</el-button
        >
		<el-button link type="primary" size="small" @click="handleClick(scope)"
		  v-show="modifyTable[scope.$index]">保存</el-button
		>
        <el-button link type="primary" size="small" @click="deleteClick(scope)" :disabled="user.role != '超级管理员' && (scope.row.role =='基层支部书记'|| scope.row.role == '分团委老师' || scope.row.role == '超级管理员') || (user.role == '超级管理员' && scope.row.role == '超级管理员')">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
  <div style="position: absolute;bottom: 10px;left:45%">
  <el-pagination  v-model:current-page="changePage.currentPage" background  :total="changePage.total" @current-change="currentChange"  layout="prev, pager, next" />
 </div>
</template>

<script setup>
	import {
	 CirclePlus
	} from '@element-plus/icons-vue'
import {findAccountList,addAndUpdateUser,deleteUser,searchDeveloper,getMes} from '../api/UserApi.js'
import {onMounted,ref,reactive} from 'vue'
import {getRoles} from '../api/RoleAPI.js'
import { ElMessage, ElMessageBox } from 'element-plus'
import {addDeveloper,deleteDeveloper} from '../api/Developers.js'
import CryptoJS from 'crypto-js';
onMounted(()=>{
	getRoleList()
	getList()
	
})


const changePage = reactive({
  currentPage: 1,
  total: 0,
});




const currentChange = (val) => {
	getList()
}



const roleList = ref([])

const getRoleList = () => {
	getRoles().then(res=>{
		var rolegrade = 1
		res.data.forEach((item)=>{
			if(item.rolename == user.role){
				rolegrade = item.rolegrade
			}
		})
		
		res.data.forEach((item)=>{
			if(item.rolegrade >= rolegrade){
				roleList.value.push(item.rolename)
			}
		})
		
	})
}

const handleClick = (scope) => {
	if(modifyTable.value[scope.$index]){
		getMes({id:scope.row.id}).then(res=>{
	
				if(scope.row.password.length == 0){
					scope.row.password = res.data.password
				}else{
				
				   scope.row.password = md5(scope.row.password)	
				}
				
			
			addAndUpdateUser(scope.row).then(res=>{
				if(res.code == 200){
					  modifyTable.value[scope.$index] = !modifyTable.value[scope.$index]
					  searchDeveloper(JSON.parse(localStorage.getItem("token"))).then(sres=>{
						  console.log(sres,123)
						  if(sres.data.length > 0){
							  var date = new Date()
							  sres.data.forEach((item)=>{
								  addDeveloper({from:JSON.parse(localStorage.getItem("token")).id,
								  to:item.id,
								  createtime:date.toISOString()
								  }).then(tres=>{
									 console.log(tres)
								  })
							  })
						  }
					  })
					  getList()
					ElMessage({
					   message: '操作成功',
					   type: 'success',
					 })
				}else{
					scope.row.password = ''
					ElMessage({
					   message: res.message,
					   type: 'error',
					 })
				}
			})
			
			
		})

		
	}else{
		modifyTable.value[scope.$index] = !modifyTable.value[scope.$index]
	}

}
const md5 = (str) => {
    const wordArray = CryptoJS.enc.Utf8.parse(str);
    const md5WordArray = CryptoJS.MD5(wordArray);
    const md5Str = CryptoJS.enc.Hex.stringify(md5WordArray);
    return md5Str;
}

const deleteClick = (scope) => {
	 ElMessageBox.confirm(
	    '确认删除账户？',
	    {
	      confirmButtonText: '确认',
	      cancelButtonText: '取消',
	      type: 'warning',
	    }
	  )
	    .then(() => {
			deleteUser({id:scope.row.id}).then(res=>{
				if(res.code == 200){
					tableData.value.splice(scope.$index,1)
					modifyTable.value.splice(scope.$index,1)
					ElMessage({
					  type: 'success',
					  message: res.data,
					})
				}else{
					ElMessage({
					  type: 'error',
					  message:"服务器错误",
					})
				}
			})	
	    })
	    .catch(() => {
	      ElMessage({
	        type: 'info',
	        message: '已取消',
	      })
	    })
	
	
	
}

const addMes = () => {
	
	modifyTable.value.push(true)
	tableData.value.push(JSON.parse(JSON.stringify(obj)))
	
}


const getList = () =>{
	findAccountList(JSON.parse(localStorage.getItem("token")),{page:changePage.currentPage,size:10}).then(res=>{
		if(res.code == 200){
			modifyTable.value = []
			res.data.forEach((item)=>{
				item.password = ''
				modifyTable.value.push(false)
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



const tableData = ref([])
const user = reactive(JSON.parse(localStorage.getItem('token')))
const modifyTable = ref([])

const obj = reactive({

	belongto: user.belongto,
	
	
})
</script>
