<template>
 
  <el-menu
    :default-active="activeIndex2"
    class="el-menu-demo"
    mode="horizontal"
    background-color="rgb(230,25,25)"
    text-color="#fff"
    active-text-color="#ffd04b"
    @select="handleSelect"
	style="position: relative;"
  >
    <el-menu-item index="1" style="font-size:25px;"><img src="../assets/image/dh.png" style="width: 50px"/><span style="margin-left: 30px;">智慧党建</span></el-menu-item>
  
	<el-sub-menu index="2" style="position: absolute;right:1%;">
	  <template #title>工作台</template>
	  <el-menu-item index="unlogin">退出登录</el-menu-item>
	</el-sub-menu>
  </el-menu>
</template>

<script lang="ts" setup>
import { ref } from 'vue'
import {useRouter} from 'vue-router'
import { ElMessage } from 'element-plus'
const activeIndex = ref('1')
const activeIndex2 = ref('1')
const router = useRouter()
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
  if(key == 'unlogin'){
	  ElMessage({
		  message: '退出成功',
		  type: 'success',
	  })
	  localStorage.clear()
	  router.push('/login')
  }
}
</script>
