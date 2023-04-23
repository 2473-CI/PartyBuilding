package com.ru.springboot3.controller;

import com.ru.springboot3.model.Result;
import com.ru.springboot3.model.Volunteer;
import com.ru.springboot3.service.Imp.VolunteerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/volunteer")
@RestController
public class VolunteerController {
    @Autowired
    private VolunteerServiceImp volunteerServiceImp;

    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Volunteer volunteer){
        try {
            volunteerServiceImp.insert(volunteer);
            return Result.success("新增成功！");
        }catch (Exception err){
            return Result.error("新增失败！");
        }
    }

    @PostMapping("/update")
    public Result<String> update(@RequestBody Volunteer volunteer){
        if(volunteer.getId() == null){
            return Result.error("确实关键信息！");
        }
        try {
            volunteerServiceImp.update(volunteer);
            return Result.success("更新成功!");
        }catch (Exception err){
            return Result.error("更新失败！");
        }
    }


    @DeleteMapping("/delete")
    public Result<String> delete(@RequestBody Volunteer volunteer){
        if(volunteer.getId() == null){
            return Result.error("确实关键信息！");
        }
        try {
            volunteerServiceImp.delete(volunteer);
            return Result.success("删除成功!");
        }catch (Exception err){
            return Result.error("删除失败！");
        }
    }

    @PostMapping("/getList")
    public Result<List<Volunteer>> getList(@RequestBody Volunteer volunteer,
                                @RequestParam(value = "page", defaultValue = "1") int page,
                                @RequestParam(value = "size", defaultValue = "20") int size
                                  ){
        if (volunteer.getBelongto() == null){
            return Result.error("确实相关信息！");
        }
        List<Volunteer> volunteers;
        try {
            volunteers = volunteerServiceImp.getList(volunteer);
        }catch (Exception err){
            return Result.error("查询失败！");
        }
        Result<List<Volunteer>> res = Result.success(volunteers);
        res.setSize(volunteers.size());
        return res;

    }
}
