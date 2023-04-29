package com.ru.springboot3.controller;

import com.ru.springboot3.mapper.InterviewMapper;
import com.ru.springboot3.model.Interview;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.service.Imp.InterviewServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/interview")
@RestController
public class InterviewControllor {
    @Autowired
    private InterviewServiceImp interviewServiceImp;
    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Interview interview){
        try {
            interviewServiceImp.insert(interview);
            return Result.success("插入成功！");
        }catch (Exception err){
            return Result.error("插入失败！");
        }
    }

    @PostMapping("/update")
    public Result<String> update(@RequestBody Interview interview){
        try {
            interviewServiceImp.update(interview);
            return Result.success("更新成功！");
        }catch (Exception err){
            return Result.error("更新失败！");
        }
    }

    @DeleteMapping("/delete")
    public Result<String> delete(@RequestBody Interview interview){
        try {
            interviewServiceImp.delete(interview);
            return Result.success("删除成功！");
        }catch (Exception err){
            return Result.error("删除失败！");
        }
    }


    @PostMapping("/getList")
    public Result<List<Interview>> getList(@RequestBody Interview interview,
                                           @RequestParam(value = "page", defaultValue = "1") int page,
                                           @RequestParam(value = "size", defaultValue = "20") int size){
        List<Interview> interviews;
        try {
            interviews = interviewServiceImp.selectByBelongTo(interview);

        }catch (Exception err){
            return Result.error("查询失败！");
        }
        Result<List<Interview>> res = Result.success(interviews.subList((page-1)*size, Math.min(page*size, interviews.size())));
        res.setSize(interviews.size());
        return res;
    }

}
