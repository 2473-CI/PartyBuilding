export function timeSolve(time){
	var date = new Date(time)
	return date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()
	
}

export function frontTimeSolve(time){
	var date = new Date(time)
	return date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()
	
}