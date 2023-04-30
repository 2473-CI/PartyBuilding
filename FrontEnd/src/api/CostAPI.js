import service from "../request/index.js"


export function findCostList(data,params){
	return service({
		url:'/cost/payable',
		method:'post',
		data,
		params
	})
}


export function addCost(data){
	return service({
		url:'/cost/insert',
		method:'post',
		data
	})
}

export function payIt(data){
	return service({
		url:'/cost/pay',
		method:'post',
		data
	})
}