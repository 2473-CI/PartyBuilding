package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.TransferMapper;
import com.ru.springboot3.model.Transfer;
import com.ru.springboot3.model.TransferExample;
import com.ru.springboot3.model.UserExample;
import com.ru.springboot3.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferServiceImp implements TransferService {
    @Autowired
    private TransferMapper transferMapper;

    @Override
    public void insert(Transfer transfer) {
        transferMapper.insert(transfer);
    }

    @Override
    public List<Transfer> selectByFrom(Transfer transfer) {
        TransferExample transferExample = new TransferExample();
        TransferExample.Criteria criteria = transferExample.createCriteria();
        criteria.andFrombelongtoEqualTo(transfer.getFrombelongto());
        return transferMapper.selectByExample(transferExample);
    }

    @Override
    public List<Transfer> pendingApproval(Transfer transfer) {
        TransferExample transferExample = new TransferExample();
        TransferExample.Criteria criteria = transferExample.createCriteria();
        criteria.andTobelongtoEqualTo(transfer.getTobelongto());
        criteria.andStatusEqualTo("待审批");
        return transferMapper.selectByExample(transferExample);
    }

    @Override
    public List<Transfer> selectAll() {
        return transferMapper.selectByExample(null);
    }

    @Override
    public void updateStatus(Transfer transfer) {
        transferMapper.updateByPrimaryKey(transfer);
    }


}
