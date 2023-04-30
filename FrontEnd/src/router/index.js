import { createRouter, createWebHistory } from "vue-router";


import login from '../views/login.vue'
import index from '../views/index.vue'
import accountlist from '../views/accountlist.vue'
import life from '../views/life.vue'
import developers from '../views/developers.vue'
import volunteer from '../views/volunteer.vue'
import help from '../views/help.vue'
import activity from '../views/activity.vue'
import interview from '../views/interview.vue'
import cost from '../views/cost.vue'
import exam from "../views/exam.vue";
import transfer from '../views/transfer.vue'
const routes = [
  {
    path: "/",
    redirect: "/index",
  },
  {
    path: "/index",
    name: "index",
    component: index,
    meta: {
      showTopBar: true,
      showMenu: true,
    },
  },
  {
    path: "/exam",
    name: "exam",
    component: exam,
    meta: {
      showTopBar: true,
      showMenu: true,
    },
  },
  {
    path: "/login",
    name: "login",
    component: login,
    meta: {
      showTopBar: false,
      showMenu: false,
    },
  },
  {
    path: "/accountlist",
    name: "accountlist",
    component: accountlist,
    meta: {
      showTopBar: true,
      showMenu: true,
    },
  },
  {
    path: "/life",
    name: "life",
    component: life,
    meta: {
      showTopBar: true,
      showMenu: true,
    },
  },
  {
    path: "/developers",
    name: "developers",
    component: developers,
    meta: {
      showTopBar: true,
      showMenu: true,
    },
  },
  {
    path: "/volunteer",
    name: "volunteer",
    component: volunteer,
    meta: {
      showTopBar: true,
      showMenu: true,
    },
  },
  {
    path: "/help",
    name: "help",
    component: help,
    meta: {
      showTopBar: true,
      showMenu: true,
    },
  },
  {
    path: "/activity",
    name: "activity",
    component: activity,
    meta: {
      showTopBar: true,
      showMenu: true,
    },
  },
  {

	 path: "/interview",
	 name: "interview",
	 component: interview,
	 meta:{
	 	showTopBar:true,
	 	showMenu:true
	 }   	    
  },
  {
	  path: "/cost",
	  name: "cost",
	  component: cost,
	  meta:{
	  	showTopBar:true,
	  	showMenu:true
	  }   	    
  },
  {
	  path: "/transfer",
	  name: "transfer",
	  component: transfer,
	  meta:{
	  	showTopBar:true,
	  	showMenu:true
	  } 
  }

  
];

export const router = createRouter({
  history: createWebHistory(),
  routes,
});

//注册一个全局前置守卫
router.beforeEach((to, from, next) => {
  if (to.path == "/login" || to.path == "/register") {
    next();
  } else {
    if (localStorage.getItem("token") != null) {
      next();
    } else {
      router.replace("/login");
    }
  }
});
