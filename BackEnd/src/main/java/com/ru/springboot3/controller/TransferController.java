package com.ru.springboot3.controller;

import com.ru.springboot3.mapper.TransferMapper;
import com.ru.springboot3.model.Result;
import com.ru.springboot3.model.Transfer;
import com.ru.springboot3.service.Imp.TransferServiceImp;
import com.ru.springboot3.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@CrossOrigin(origins = "*")
@RequestMapping("/transfer")
@RestController
public class TransferController {
    @Autowired
    private TransferServiceImp transferServiceImp;
    // 待审批 审批通过 驳回
    @PostMapping("/insert")
    public Result<String> insert(@RequestBody Transfer transfer){
        if(transfer.getFrombelongto() == null || transfer.getTobelongto() == null || transfer.getUserid() == null){
            return Result.success("相关信息不全");
        }
        try{
            transferServiceImp.insert(transfer);
            return Result.success("创建成功！");
        }catch (Exception err){
            return Result.success("创建失败！");
        }
    }

    @PostMapping("/start")
    private Result<List<Transfer>> getStart(@RequestBody Transfer transfer,
                                            @RequestParam(value = "page", defaultValue = "1") int page,
                                            @RequestParam(value = "size", defaultValue = "20") int size
                                            ){
        if(transfer.getFrombelongto() == null){
            return Result.error("缺少关键信息！");
        }
        List<Transfer> transfers;

        try {
            transfers = transferServiceImp.selectByFrom(transfer);
            Result<List<Transfer>> res = Result.success(transfers.subList((page - 1) * size, Math.min(page * size, transfers.size())));
            res.setSize(transfers.size());
            return res;
        }catch (Exception err){
            return Result.error("查询失败！");
        }
    }

    @PostMapping("/pendingApproval")
    public Result<List<Transfer>> PendingApproval(@RequestBody Transfer transfer,
                                                  @RequestParam(value = "page", defaultValue = "1") int page,
                                                  @RequestParam(value = "size", defaultValue = "20") int size
    ){
        if(transfer.getTobelongto() == null){
            return Result.error("缺少关键信息！");
        }
        List<Transfer> transfers;
        try {
            transfers = transferServiceImp.pendingApproval(transfer);
            Result<List<Transfer>> res = Result.success(transfers.subList((page - 1) * size, Math.min(page * size, transfers.size())));
            res.setSize(transfers.size());
            return res;
        }catch (Exception err){
            return Result.error("查询失败！");
        }
    }

    @PostMapping("/approval")
    public Result<String> approval(@RequestBody Transfer transfer){
        if(transfer.getId() == null){
            return Result.error("缺少关键信息！");
        }
        try {
            transferServiceImp.updateStatus(transfer);
            return Result.success("更新成功！");
        }catch (Exception err){
            return Result.error("更新失败！");
        }
    }

}
