import service from "../request/index.js"

export function addInterview(data){
	return service({
		url:'/interview/insert',
		method:'post',
		data
	})
}


export function findInterviewList(data,params){
	return service({
		url:'/interview/getList',
		method:'post',
		data,
		params
	})
}

export function updateInterview(data){
	return service({
		url:'/interview/update',
		method:'post',
		data
	})
}

export function deleteInterview(data){
	return service({
		url:'/interview/delete',
		method:'delete',
		data
	})
}


