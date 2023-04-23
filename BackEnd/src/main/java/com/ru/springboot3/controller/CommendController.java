package com.ru.springboot3.controller;

import com.ru.springboot3.model.Commend;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.service.CommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/commend")
@RestController
public class CommendController {
    @Autowired
    private CommendService commendService;

    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Commend commend){
        try {
            commendService.insert(commend);
            return Result.success("新增成功！");
        }catch (Exception err){
            return Result.error("新增失败！");
        }
    }

    @PostMapping("/update")
    public Result<String> update(@RequestBody Commend commend){
        if (commend.getId() == null){
            return Result.error("缺失相关信息");
        }
        try {
            commendService.update(commend);
            return Result.success("修改成功！");
        }catch (Exception err){
            return Result.error("修改失败！");
        }
    }

    @DeleteMapping("/delete")
    public Result<String> delete(@RequestBody Commend commend){
        if (commend.getId() == null){
            return Result.error("缺失相关信息");
        }
        try {
            commendService.delete(commend);
            return Result.success("删除成功！");
        }catch (Exception err){
            return Result.error("删除失败！");
        }
    }


    @PostMapping("/getList")
    public Result<List<Commend>> getList(@RequestBody Commend commend,
                                @RequestParam(value = "page", defaultValue = "1") int page,
                                @RequestParam(value = "size", defaultValue = "20") int size
                                  ){
        if (commend.getPartyname() == null){
            return Result.error("缺失相关信息");
        }
        List<Commend> commends;
        try {
            commends = commendService.selectByParty(commend);
        }catch (Exception err){
            return Result.error("查询失败！");
        }
        Result<List<Commend>> res = Result.success(commends.subList((page - 1) * size, Math.min(commends.size(), page * size)));
        res.setSize(commends.size());
        return res;
    }
}
