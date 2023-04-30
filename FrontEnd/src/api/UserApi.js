import service from "../request/index.js"

//登录接口
export function loginUser(data){
	return service({
		url:'/user/login',
		method:'post',
		data
	})
}

//查看账户列表
export function findAccountList(data,params){
	return service({
		url:'/user/getList',
		method:'post',
		data,
		params
	})
}

//添加、更改账户
export function addAndUpdateUser(data){
	return service({
		url:'/user/updateAndInsert',
		method:'post',
		data
	})
}

//删除用户
export function deleteUser(data){
	return service({
		url:'/user/delete',
		method:'delete',
		data
	})
}

//搜索未添加的发展党员
export function searchDeveloper(data){
	return service({
		url:'/user/toBeDeveloped',
		method:'post',
		data
	})
}

export function getMes(data){
	return service({
		url:'/user/getById',
		method:'post',
		data
	})
}