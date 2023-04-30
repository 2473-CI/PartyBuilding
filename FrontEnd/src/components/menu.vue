<template>
  <el-row class="tac">
    <el-col :span="25">
      <el-menu
        active-text-color="#ffd04b"
        background-color="rgb(230,25,25)"
        class="el-menu-vertical-demo"
        default-active="2"
        text-color="#fff"
        @open="handleOpen"
        @close="handleClose"
        @select="choose"
      >

	    <el-menu-item style="height: 200px;position: relative;">
	          <img src="../assets/image/dh.png" style="width: 100px;position: absolute;left:20%;"/>
			  <p style="position: absolute;bottom: 10px;left:25%;">你好，{{obj.name}}</p>
	          </el-menu-item>
	  

        <el-sub-menu index="1">
          <template #title>
            <el-icon><location /></el-icon>
            <span>党务工作中心</span>
          </template>

            <el-menu-item index="/life">组织生活</el-menu-item>
            <el-menu-item index="/developers" v-if="obj.role == '分团委老师' || obj.role == '基层支部书记'">发展党员</el-menu-item>
			<el-menu-item index="/cost">党费管理</el-menu-item>
			<el-menu-item index="/transfer" v-if="obj.role == '分团委老师'">组织关系转接</el-menu-item>
         </el-sub-menu>
		 
		 <el-sub-menu index="2">
		          <template #title>
		            <el-icon><setting /></el-icon>
		            <span>党群服务中心</span>
		          </template>
		            <el-menu-item index="/interview">走访联系</el-menu-item>
		            <el-menu-item index="/help">结对帮扶</el-menu-item>
		            <el-menu-item index="/volunteer">志愿服务</el-menu-item>
		            <el-menu-item index="/activity">党群活动</el-menu-item>
		        </el-sub-menu>
		 <el-sub-menu index="3">
		          <template #title>
		            <el-icon><icon-menu /></el-icon>
		            <span>教育培训中心</span>
		          </template>
		       <el-menu-item index="/">党员学习</el-menu-item>
		       <el-menu-item index="/exam">考试管理</el-menu-item>
		        </el-sub-menu>
 <el-sub-menu index="4"  v-if="obj.role == '分团委老师' || obj.role == '基层支部书记' || obj.role == '超级管理员'">

          <template #title>
            <el-icon><setting /></el-icon>
            <span>系统管理</span>
          </template>
            <el-menu-item index="/accountlist">用户管理</el-menu-item>

        </el-sub-menu>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script setup>
import {
  Document,
  Menu as IconMenu,
  Location,
  Setting,
} from "@element-plus/icons-vue";
import { useRouter } from "vue-router";
import { ref } from "vue";
const router = useRouter();
const choose = (index, item) => {
  router.push(index);
};

const obj = ref(JSON.parse(localStorage.getItem('token')))

</script>
