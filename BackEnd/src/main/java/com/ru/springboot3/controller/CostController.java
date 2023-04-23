package com.ru.springboot3.controller;

import com.ru.springboot3.model.Cost;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.service.Imp.CostServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/cost")
@RestController
public class CostController {
    @Autowired
    private CostServiceImp costServiceImp;

    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Cost cost){
        if (cost.getBelongto() == null || cost.getCostnumber() == null){
            return Result.error("缴费团体或缴费金额不明");
        }
        try {
            costServiceImp.insert(cost);
            return Result.success("创建成功！");
        }catch (Exception err){
            return Result.error("创建失败！");
        }
    }

    @PostMapping("/pay")
    public Result<String> pay(@RequestBody Cost cost){
        if (cost.getId() == null){
            return Result.success("Id不能为空");
        }
        try {
            costServiceImp.updateStatus(cost);
            return Result.success("缴费成功！");
        }catch (Exception err){
            return Result.error("缴费失败！");
        }
    }

    @PostMapping("/payable")
    public Result<List<Cost>> payable(@RequestBody Cost cost,
                                           @RequestParam(value = "page", defaultValue = "1") int page,
                                           @RequestParam(value = "size", defaultValue = "20") int size){

        if(cost.getStatus() == null || cost.getBelongto() == null){
            return Result.error("查询状态不明，查询失败！");
        }
        List<Cost> costs ;
        try {
            costs = costServiceImp.selectByStatusAndBelongTo(cost);
        }catch (Exception err){
            return Result.error("查询失败！");
        }
        Result<List<Cost>> res = Result.success(costs.subList((page - 1) * size, Math.min(page * size, costs.size())));
        res.setSize(costs.size());
        return res;
    }
}
