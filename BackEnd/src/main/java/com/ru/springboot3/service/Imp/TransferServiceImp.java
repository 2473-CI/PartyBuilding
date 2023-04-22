package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.TransferMapper;
import com.ru.springboot3.model.Transfer;
import com.ru.springboot3.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;

public class TransferServiceImp implements TransferService {
    @Autowired
    private TransferMapper transferMapper;

    @Override
    public void insert(Transfer transfer) {
        transferMapper.insert(transfer);
    }


}
