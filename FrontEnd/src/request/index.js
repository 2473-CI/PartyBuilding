import axios from "axios";
import { router } from "../router/index.js";

const service = axios.create({

    baseURL: "http://47.115.207.245:1994",
  // baseURL: "http://192.168.10.142:1994",


  timeout: 10000,
});
service.interceptors.request.use(
  (config) => {
    // if(localStorage.getItem('token')){
    //    config.headers['token'] = localStorage.getItem('token')
    // }
    return config;
  },
  (error) => {
    return Promise.reject(error);
  }
);

service.interceptors.response.use((response) => {
  let res = response.data;
  if (res.code == 401) {
    localStorage.clear();
    router.replace("/login");
  }
  return res;
});

export default service;
