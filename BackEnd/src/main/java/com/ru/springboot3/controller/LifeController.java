package com.ru.springboot3.controller;

import com.ru.springboot3.model.Life;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.model.User;
import com.ru.springboot3.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/life")
@RestController
public class LifeController {
    @Autowired
    private LifeService lifeService;

    @PostMapping("/getList")
    public Result<List<Life>> getList(@RequestBody User user,
                                      @RequestParam(value = "page", defaultValue = "1") int page,
                                      @RequestParam(value = "size", defaultValue = "20") int size
                                      ){
        List<Life> lives;

        if ("超级管理员".equals(user.getRole())){
            lives = lifeService.selectAll();
        }else if(user.getBelongto() != null){
            Life life = new Life();
            life.setBelongto(user.getBelongto());
            lives = lifeService.selectByBelongTo(life);
        }else {
            lives = new ArrayList<>();
        }
        Result<List<Life>> result = Result.success(lives.subList((page - 1) * size, Math.min(page * size, lives.size())));
        result.setSize(lives.size());
        return result;
    }

    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Life life){
        if (life.getBelongto() == null){
            return Result.error("党支部为空！");
        }
        try {
            lifeService.insert(life);
            return Result.success("新增成功！");
        }catch (Exception err){
            return Result.error("新增失败！");
        }
    }

    @PostMapping("/update")
    public Result<String> update(@RequestBody Life life){
        if (life.getId() == null){
            return Result.error("修改时Id不能为空！");
        }
        try {
            lifeService.update(life);
            return Result.success("修改成功！");
        }catch (Exception err){
            return Result.error("修改失败！");
        }
    }

    @DeleteMapping("/delete")
    public Result<String> delete(@RequestBody Life life){
        if (life.getId() == null){
            return Result.error("Id不能为空！");
        }
        try {
            lifeService.delete(life);
            return Result.success("删除成功！");
        }catch (Exception err){
            return Result.error("删除失败！");
        }
    }

}
