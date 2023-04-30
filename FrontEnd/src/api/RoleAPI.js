import service from "../request/index.js"

export function getRoles(){
	return service({
		url:'/role/getList',
		method:'get'
	})
}