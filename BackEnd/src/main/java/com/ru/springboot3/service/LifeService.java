package com.ru.springboot3.service;

import com.ru.springboot3.model.Life;

import java.util.List;

public interface LifeService {

    public void insert(Life life);

    public void update(Life life);

    public void delete(Life life);

    public List<Life> selectAll();

    public List<Life> selectByBelongTo(Life life);
}
