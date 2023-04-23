package com.ru.springboot3.service;

import com.ru.springboot3.model.Transfer;

import java.util.List;

public interface TransferService {
    public void insert(Transfer transfer);

    public List<Transfer> selectByFrom(Transfer transfer);

    public List<Transfer> pendingApproval(Transfer transfer);

    public List<Transfer> selectAll();

    public void updateStatus(Transfer transfer);
}
