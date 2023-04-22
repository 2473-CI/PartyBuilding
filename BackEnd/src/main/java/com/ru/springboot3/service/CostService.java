package com.ru.springboot3.service;

import com.ru.springboot3.model.Cost;

import java.util.List;

public interface CostService {
    public void insert(Cost cost);

    public void updateStatus(Cost cost);

    public List<Cost> selectByStatusAndBelongTo(Cost cost);
}
