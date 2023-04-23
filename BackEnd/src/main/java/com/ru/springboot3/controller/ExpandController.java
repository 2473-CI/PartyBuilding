package com.ru.springboot3.controller;

import com.ru.springboot3.model.Expand;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.model.User;
import com.ru.springboot3.service.Imp.ExpandServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RequestMapping("/expand")
@RestController
public class ExpandController {
    @Autowired
    private ExpandServiceImp expandServiceImp;

    @PostMapping("/getList")
    public Result<List<Map>> getList(@RequestBody User user,
                             @RequestParam(value = "page", defaultValue = "1") int page,
                             @RequestParam(value = "size", defaultValue = "20") int size){

        List<Map> maps = new ArrayList<>();
        if("超级管理员".equals(user.getRole())){
            maps = expandServiceImp.selectAll();
        }else if("分团委老师".equals(user.getRole()) || "基层支部书记".equals(user.getRole())) {
            if(user.getBelongto() == null){
                maps = new ArrayList<>();
            }else {
                maps = expandServiceImp.selectByBelongTo(user.getBelongto());
            }
        }else {
            maps = new ArrayList<>();
        }
        Result<List<Map>> result = Result.success(maps.subList((page - 1) * size, Math.min(page * size, maps.size())));
        result.setSize(maps.size());
        return result;
    }


    @DeleteMapping("/delete")
    public Result<String> delete(@RequestBody  Expand expand){
        if(expand.getId() == null){
            return Result.error("id不能为空");
        }
        try {
            expandServiceImp.delete(expand);
            return Result.success("删除成功");
        }catch (Exception err){
            return Result.error("删除失败");
        }
    }

    @PostMapping("insert")
    public Result<String> insert(@RequestBody Expand expand) {

        System.out.println("From:"+expand.getFrom());
        System.out.println("To:"+expand.getTo());
        System.out.println("Createtime:"+expand.getCreatetime());
        if(expand.getFrom() == null || expand.getTo() == null || expand.getCreatetime() == null){
            return Result.error("相关字段不能为空");
        }
        try {
            expandServiceImp.insert(expand);
            return Result.success("新增成功！");
        }catch (Exception err){
            return Result.error("邢增失败！");
        }
    }
}
