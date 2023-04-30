import service from "../request/index.js"

export function addActivity(data,params){
	return service({
		url:'/activity/insert',
		method:'post',
		data,
		params
	})
}


export function findActivityList(data){
	return service({
		url:'/activity/getList',
		method:'post',
		data
	})
}

export function updateActivity(data){
	return service({
		url:'/activity/update',
		method:'post',
		data
	})
}

export function deleteActivity(data){
	return service({
		url:'/activity/update',
		method:'delete',
		data
	})
}
