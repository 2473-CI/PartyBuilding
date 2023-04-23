package com.ru.springboot3.service;

import com.ru.springboot3.model.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {
    public void insert(Activity activity);

    public void update(Activity activity);

    public void delete(Activity activity);

    public List<Activity> selectAll();

    public List<Activity> selectByBelongTo(Activity activity);
}
