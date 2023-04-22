package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.ExpandMapper;
import com.ru.springboot3.mapper.UserMapper;
import com.ru.springboot3.model.Expand;
import com.ru.springboot3.model.User;
import com.ru.springboot3.model.UserExample;
import com.ru.springboot3.service.ExpandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpandServiceImp implements ExpandService {
    @Autowired
    private ExpandMapper expandMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    public void insert(Expand expand) {
        expandMapper.insert(expand);
    }

    @Override
    public void delete(Expand expand) {
        expandMapper.deleteByPrimaryKey(expand.getId());
    }

    @Override
    public List<Map> selectByBelongTo(String belongTo) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andBelongtoEqualTo(belongTo);
        List<User> users = userMapper.selectByExample(userExample);
        List<Expand> expands = expandMapper.selectByExample(null);
        List<Map> res = new ArrayList<>();
        Map<Integer, User> map = new HashMap<>();
        for (User user: users){
            map.put(user.getId(), user);
        }
        for (Expand expand : expands){
            Integer id = expand.getId();
            User user = map.get(id);
            if (user == null){
                continue;
            }
            Map<String, Object> tmp = new HashMap<>();
            tmp.put("id", expand.getId());
            tmp.put("from", map.get(expand.getFrom()));
            tmp.put("to", map.get(expand.getTo()));
            tmp.put("createTime", expand.getCreatetime());
            res.add(tmp);
        }

        return res;
    }


    @Override
    public List<Map> selectAll() {
        List<User> users = userMapper.selectByExample(null);
        List<Expand> expands = expandMapper.selectByExample(null);
        List<Map> res = new ArrayList<>();
        Map<Integer, User> map = new HashMap<>();
        for (User user: users){
            map.put(user.getId(), user);
        }
        for (Expand expand : expands){
            Integer id = expand.getId();
            User user = map.get(id);
            if (user == null){
                continue;
            }
            Map<String, Object> tmp = new HashMap<>();
            tmp.put("id", expand.getId());
            tmp.put("from", map.get(expand.getFrom()));
            tmp.put("to", map.get(expand.getTo()));
            tmp.put("createTime", expand.getCreatetime());
            res.add(tmp);
        }

        return res;
    }
}
