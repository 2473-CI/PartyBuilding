import service from "../request/index.js";

//添加发展党员
export function addDeveloper(data) {
  return service({
    url: "/expand/insert",
    method: "post",
    data,
  });
}

//查询发展党员
export function findDevelopersList(data,params) {
  return service({
    url: "/expand/getList",
    method: "post",
    data,
	params
  });
}

//删除发展党员
export function deleteDeveloper(data) {
  return service({
    url: "/expand/delete",
    method: "delete",
    data,
  });
}

//党员学习接口
export function add(data) {
  return service({
    url: "/study/insert",
    method: "post",
    data,
  });
}

export function getAllList(data) {
  return service({
    url: "/study/getList",
    method: "post",
    data,
  });
}

export function del(data) {
  return service({
    url: "/study/delete",
    method: "delete",
    data,
  });
}

export function update(data) {
  return service({
    url: "/study/update",
    method: "post",
    data,
  });
}

//考试接口
export function addExam(data) {
  return service({
    url: "/examination/insert",
    method: "post",
    data,
  });
}

export function getAllListExam(data) {
  return service({
    url: "/examination/getList",
    method: "post",
    data,
  });
}

export function delExam(data) {
  return service({
    url: "/examination/delete",
    method: "delete",
    data,
  });
}

export function updateExam(data) {
  return service({
    url: "/examination/update",
    method: "post",
    data,
  });
}
