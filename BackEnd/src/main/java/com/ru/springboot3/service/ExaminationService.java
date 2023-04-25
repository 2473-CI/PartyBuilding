package com.ru.springboot3.service;

import com.ru.springboot3.model.Examination;

import java.util.List;

public interface ExaminationService {
    public void insert(Examination exception);

    public void update(Examination exception);

    public void delete(Examination exception);

    public List<Examination> selectByBelongTo(Examination exception);
}
