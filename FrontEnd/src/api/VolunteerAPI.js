import service from "../request/index.js"

export function findVolunteerList(data,params){
	return service({
		url:'/volunteer/getList',
		method:'post',
		data,
		params
	})
}

export function addVolunteer(data){
	return service({
		url:'/volunteer/insert',
		method:'post',
		data
	})
}

export function updateVolunteer(data){
	return service({
		url:'/volunteer/update',
		method:'post',
		data
	})
}

export function deleteVolunteer(data){
	return service({
		url:'/volunteer/delete',
		method:'delete',
		data
	})
}

