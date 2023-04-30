import service from "../request/index.js"

export function findHelpList(data,params){
	return service({
		url:'/help/getList',
		method:'post',
		data,
		params
	})
}

export function addHelp(data){
	return service({
		url:'/help/insert',
		method:'post',
		data
	})
}


export function deleteHelp(data){
	return service({
		url:'/help/delete',
		method:'delete',
		data
	})
}


export function updateHelp(data){
	return service({
		url:'/help/update',
		method:'post',
		data
	})
}
