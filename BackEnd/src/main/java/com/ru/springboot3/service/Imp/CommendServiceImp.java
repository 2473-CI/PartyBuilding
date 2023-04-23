package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.CommendMapper;
import com.ru.springboot3.model.Commend;
import com.ru.springboot3.model.CommendExample;
import com.ru.springboot3.service.CommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommendServiceImp implements CommendService {
    @Autowired
    private CommendMapper commendMapper;

    @Override
    public void insert(Commend commend) {
        commendMapper.insert(commend);
    }

    @Override
    public void update(Commend commend) {
        commendMapper.updateByPrimaryKey(commend);
    }

    @Override
    public void delete(Commend commend) {
        commendMapper.deleteByPrimaryKey(commend.getId());
    }

    @Override
    public List<Commend> selectAll() {
        return commendMapper.selectByExample(null);
    }

    @Override
    public List<Commend> selectByParty(Commend commend) {
        CommendExample commendExample = new CommendExample();
        CommendExample.Criteria criteria = commendExample.createCriteria();
        criteria.andPartynameEqualTo(commend.getPartyname());
        return commendMapper.selectByExample(commendExample);
    }
}
