import service from "../request/index.js"


export function addTransfer(data){
	return service({
		url:'/transfer/insert',
		method:'post',
		data
	})
}

export function findStartTransfer(data,params){
	return service({
		url:'/transfer/start',
		method:'post',
		data,
		params
	})
}

export function findPendingApproval(data,params){
	return service({
		url:'/transfer/pendingApproval',
		method:'post',
		data,
		params
	})
}

export function approval(data){
	return service({
		url:'/transfer/approval',
		method:'post',
		data
	})
}