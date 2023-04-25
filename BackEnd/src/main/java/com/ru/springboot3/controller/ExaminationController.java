package com.ru.springboot3.controller;

import com.ru.springboot3.model.Examination;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.service.Imp.ExaminationServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/examination")
@RestController
public class ExaminationController {
    @Autowired
    private ExaminationServiceImp examinationServiceImp;

    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Examination examination){
        try {
            examinationServiceImp.insert(examination);
            return Result.success("插入成功！");
        }catch (Exception err){
            return Result.error("插入失败！");
        }
    }

    @PostMapping("/update")
    public Result<String> update(@RequestBody Examination examination){
        if(examination.getId() == null){
            return Result.error("缺少关键信息！");
        }
        try {
            examinationServiceImp.update(examination);
            return Result.success("修改成功！");
        }catch (Exception err){
            return Result.error("修改失败！");
        }
    }


    @DeleteMapping("/delete")
    public Result<String> delete(@RequestBody Examination examination){
        if(examination.getId() == null){
            return Result.error("缺少关键信息！");
        }
        try {
            examinationServiceImp.delete(examination);
            return Result.success("删除成功！");
        }catch (Exception err){
            return Result.error("删除失败！");
        }
    }


    @PostMapping("/getList")
    public Result<List<Examination>> getList(@RequestBody Examination examination){
        if(examination.getBelongto() == null){
            return Result.error("缺少关键信息！");
        }
        try {
            List<Examination> examinations = examinationServiceImp.selectByBelongTo(examination);
            return Result.success(examinations);
        }catch (Exception err){
            return Result.error("查询成功！！");
        }
    }
}
