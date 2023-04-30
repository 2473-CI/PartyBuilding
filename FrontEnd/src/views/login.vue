<script setup>
import {UserFilled, Lock} from '@element-plus/icons-vue'
import {reactive} from "vue";
import CryptoJS from 'crypto-js';
import {loginUser} from '../api/UserApi.js'
import { ElMessage } from 'element-plus'
import {useRouter} from 'vue-router'

const router = useRouter()

const loginForm = reactive({username: "", password: ""})

const login = () =>{
	loginUser({username:loginForm.username,
	password:md5(loginForm.password)}).then(res=>{
		if(res.code == 200){
			 ElMessage({
			    message: '登录成功',
			    type: 'success',
			  })
			localStorage.setItem("token", JSON.stringify(res.data))
			router.push('/life')
			
		}else{
			 ElMessage.error(res.message)
		}
	})
	
}

const getImg = (path) => {
    return new URL(path, import.meta.url).href;
}

const md5 = (str) => {
    const wordArray = CryptoJS.enc.Utf8.parse(str);
    const md5WordArray = CryptoJS.MD5(wordArray);
    const md5Str = CryptoJS.enc.Hex.stringify(md5WordArray);
    return md5Str;
}
</script>


<template>
    <div id="box">
        <img id="dh" :src="getImg('../assets/image/dh.png')" alt="党徽"/>
        <div id="title">智慧云党建平台</div>

        <div style="margin-top: 30px">
            <div id="input-box">
                <el-icon id="input-icon">
                    <UserFilled/>
                </el-icon>
                <input v-model="loginForm.username" placeholder="请输入账号"/>
                <el-divider id="input-divider"/>
            </div>
            <div id="input-box">
                <el-icon id="input-icon">
                    <Lock/>
                </el-icon>
                <input v-model="loginForm.password" type="password" placeholder="请输入密码"/>
                <el-divider id="input-divider"/>
            </div>
        </div>

        <div>
            <el-button type="danger" size="large" style="width: 100px" @click="login">登录</el-button>
            <el-button type="warning" size="large" style="margin-left: 80px;width: 100px">注册</el-button>
        </div>
    </div>
</template>

<style scoped>
#box {
    width: 100%;
    height: 100%;
    background-size: 100% 100%;
    background-repeat: no-repeat;
    background-image: url("../assets/image/bg.jpg");
    display: flex;
    flex-direction: column;
    align-items: center;
}

#dh {
    margin-top: 150px;
    width: 100px;
    height: 100px;
}

#title {
    line-height: 70px;
    color: white;
    font-size: 50px;
    font-weight: bold;
    text-shadow: 4px 2px 2px bisque;
}

input {
    width: 100%;
    padding: 10px 0;
    font-size: 16px;
    color: #fff;
    margin-bottom: 30px;
    border: none;
    outline: none;
    background-color: transparent;
}

::-webkit-input-placeholder { /* WebKit, Blink, Edge */
    color: #fff;
}

#input-box {
    position: relative;
    width: 350px;
}

#input-icon {
    position: absolute;
    left: -30px;
    bottom: 37px;
    font-size: 30px;
    color: #fff
}

#input-divider {
    width: 400px;
    position: absolute;
    right: 0;
    bottom: 5px;
    left: -40px
}
</style>