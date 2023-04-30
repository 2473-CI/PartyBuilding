import service from "../request/index.js"

//添加组织生活
export function addLife(data){
	return service({
		url:'/life/insert',
		method:'post',
		data
	})
}

//查找组织生活
export function findLifeList(data,params){
	return service({
		url:'/life/getList',
		method:'post',
		data,
		params
	})
}

export function updateLife(data){
	return service({
		url:'/life/update',
		method:'post',
		data
	})
}


export function deleteLife(data){
	return service({
		url:'/life/delete',
		method:'delete',
		data
	})
}