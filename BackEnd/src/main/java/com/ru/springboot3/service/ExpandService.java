package com.ru.springboot3.service;

import com.ru.springboot3.model.Expand;

import java.util.List;
import java.util.Map;

public interface ExpandService {
    public void insert(Expand expand);

    public void delete(Expand expand);

    public List<Map> selectByBelongTo(String BelongTo);

    public List<Map> selectAll() ;
}
