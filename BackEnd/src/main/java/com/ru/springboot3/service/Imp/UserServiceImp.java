package com.ru.springboot3.service.Imp;

import com.ru.springboot3.service.UserService;
import com.ru.springboot3.mapper.UserMapper;
import com.ru.springboot3.model.User;
import com.ru.springboot3.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User user){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0){
            return null;
        }
        if (users.get(0).getPassword().equals(user.getPassword())){
            user = users.get(0);
            user.setPassword(null);
            return user;
        }
        return null;
    }

    public User register(User user){
        UserExample userExample = new UserExample();
        boolean flag = true;
        {
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andIdentitycardEqualTo(user.getIdentitycard());
            List<User> users = userMapper.selectByExample(userExample);
            if (users.size() != 0) {
                flag = false;
            }
        }
        {
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUsernameEqualTo(user.getUsername());
            List<User> users = userMapper.selectByExample(userExample);
            if (users.size() != 0) {
                flag = false;
            }
        }
        if (! flag){
            return null;
        }
        userMapper.insert(user);
        user.setPassword(null);
        return user;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public List<User> selectUserByBelongTo(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andBelongtoEqualTo(user.getBelongto());
        return userMapper.selectByExample(userExample);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void delete(User user) {
        userMapper.deleteByPrimaryKey(user.getId());
    }
}
