package com.ru.springboot3.service;

import com.ru.springboot3.model.Study;

import java.util.List;

public interface StudyService {
    public void insert(Study study);

    public void update(Study study);

    public void delete(Study study);

    public List<Study> selectByBelongTo(Study study);

    public List<Study> selectAll(Study study);
}
