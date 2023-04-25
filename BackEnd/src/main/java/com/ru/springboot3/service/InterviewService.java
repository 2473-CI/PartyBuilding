package com.ru.springboot3.service;

import com.ru.springboot3.model.Interview;

import java.util.List;

public interface InterviewService {
    public void insert(Interview interview);
    public void delete(Interview interview);
    public void update(Interview interview);
    public List<Interview> selectByBelongTo(Interview interview);
}
