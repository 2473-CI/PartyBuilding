package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.CostMapper;
import com.ru.springboot3.mapper.UserMapper;
import com.ru.springboot3.model.Cost;
import com.ru.springboot3.model.CostExample;
import com.ru.springboot3.model.User;
import com.ru.springboot3.model.UserExample;
import com.ru.springboot3.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CostServiceImp implements CostService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CostMapper costMapper;

    @Override
    public void insert(Cost cost) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andBelongtoEqualTo(cost.getBelongto());
        List<User> users = userMapper.selectByExample(userExample);
        for(User user: users){
            Cost tmp = new Cost();
            tmp.setName(user.getName());
            tmp.setUserid(user.getId());
            tmp.setBelongto(cost.getBelongto());
            tmp.setCostnumber(cost.getCostnumber());
            tmp.setCreatetime(new Date());
            tmp.setStatus("待缴费");
            costMapper.insert(tmp);
        }
    }

    @Override
    public void updateStatus(Cost cost) {
        cost.setStatus("缴费完成");
        costMapper.updateByPrimaryKey(cost);
    }

    @Override
    public List<Cost> selectByStatusAndBelongTo(Cost cost) {
        CostExample costExample = new CostExample();
        CostExample.Criteria criteria = costExample.createCriteria();
        criteria.andBelongtoEqualTo(cost.getBelongto());
        criteria.andStatusEqualTo(cost.getStatus());
        return costMapper.selectByExample(costExample);
    }
}
