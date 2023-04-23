package com.ru.springboot3.service;

import com.ru.springboot3.model.Commend;

import java.util.List;

public interface CommendService {
    public void insert(Commend commend);

    public void update(Commend commend);

    public void delete(Commend commend);

    public List<Commend> selectAll();

    public List<Commend> selectByParty(Commend commend);
}
