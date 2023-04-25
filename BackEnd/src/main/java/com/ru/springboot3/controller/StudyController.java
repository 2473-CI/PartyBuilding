package com.ru.springboot3.controller;

import com.ru.springboot3.model.Result;
import com.ru.springboot3.model.Study;
import com.ru.springboot3.service.Imp.StudyServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/study")
@RestController
public class StudyController {
    @Autowired
    private StudyServiceImp studyServiceImp;

    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Study study){
        try {
            studyServiceImp.insert(study);
            return Result.success("新增成功！");
        }catch (Exception err){
            return Result.error("新增失败！");
        }
    }

    @PostMapping("/update")
    public Result<String> update(@RequestBody Study study){
        try {
            studyServiceImp.update(study);
            return Result.success("更改成功！");
        }catch (Exception err){
            return Result.error("更改失败！");
        }
    }

    @DeleteMapping("/delete")
    public Result<String> delete(@RequestBody Study study){
        if(study.getId() == null){
            return Result.error("确实关键信息！");
        }
        try {
            studyServiceImp.delete(study);
            return Result.success("删除成功！");
        }catch (Exception err){
            return Result.error("删除失败！");
        }
    }

    @PostMapping("/getList")
    public Result<List<Study>> getList(@RequestBody Study study){
        try {
            return Result.success(studyServiceImp.selectByBelongTo(study));
        }catch (Exception err){
            return Result.error("获取失败！"+err);
        }
    }

}
