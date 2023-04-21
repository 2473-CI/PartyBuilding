package com.ru.springboot3.service;

import com.ru.springboot3.model.User;

import java.util.List;

public interface UserService {
    public User login(User user);

    public User register(User user);

    public List<User> selectAll();

    public List<User> selectUserByBelongTo(User user);

    public void update(User user);

    public void delete(User user);
}
