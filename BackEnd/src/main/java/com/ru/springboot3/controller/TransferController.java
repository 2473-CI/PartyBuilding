package com.ru.springboot3.controller;

import com.ru.springboot3.mapper.TransferMapper;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.model.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/transfer")
@RestController
public class TransferController {
    @Autowired
    private TransferMapper transferMapper;
    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Transfer transfer){
        if(transfer.getFrombelongto() == null || transfer.getTobelongto() == null || transfer.getUserid() == null){
            return Result.success("相关信息不全");
        }
        try{
            transferMapper.insert(transfer);
            return Result.success("创建成功！");
        }catch (Exception err){
            return Result.success("创建失败！");
        }
    }

//    @Autowired
//    private Result<List<Transfer>> getStart(@RequestBody Transfer transfer){
//        if(transfer.getFrombelongto() == null){
//            return Result.error("缺少关键信息！");
//        }
//        return null;
//    }

}
