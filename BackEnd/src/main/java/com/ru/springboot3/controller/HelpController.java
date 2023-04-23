package com.ru.springboot3.controller;

import com.ru.springboot3.model.Help;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.service.Imp.HelpServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/help")
@RestController
public class HelpController {
    @Autowired
    private HelpServiceImp helpServiceImp;

    @PostMapping("insert")
    public Result<String> insert(@RequestBody Help help){
        try {
            helpServiceImp.insert(help);
            return Result.success("新增成功！");
        }catch (Exception err){
            return Result.error("新增失败！");
        }
    }


    @PostMapping("/update")
    public Result<String> update(@RequestBody Help help){
        if(help.getId() == null){
            return Result.error("缺少相关信息！");
        }
        try {
            helpServiceImp.update(help);
            return Result.success("更新成功！");
        }catch (Exception err){
            return Result.error("更新失败！");
        }
    }

    @DeleteMapping("/delete")
    public Result<String> delete(@RequestBody Help help){
        if(help.getId() == null){
            return Result.error("缺少相关信息！");
        }
        try {
            helpServiceImp.delete(help);
            return Result.success("删除成功！");
        }catch (Exception err){
            return Result.error("删除失败！");
        }
    }

    @PostMapping("/getList")
    public Result<List<Help>> getList(@RequestBody Help help,
                                      @RequestParam(value = "page", defaultValue = "1") int page,
                                      @RequestParam(value = "size", defaultValue = "20") int size){
        if(help.getHelperbelongto() == null){
            return Result.error("缺少相关信息！");
        }
        List<Help> helps;
        try {
            helps = helpServiceImp.selectByBelongTo(help);
        }catch (Exception err){
            return Result.error("查询失败！");
        }
        Result<List<Help>> res = Result.success(helps.subList((page-1)*size, Math.min(helps.size(), page* size)));
        res.setSize(helps.size());
        return res;
    }
}
