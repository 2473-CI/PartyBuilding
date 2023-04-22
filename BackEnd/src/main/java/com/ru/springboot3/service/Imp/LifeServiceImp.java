package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.LifeMapper;
import com.ru.springboot3.model.Life;
import com.ru.springboot3.model.LifeExample;
import com.ru.springboot3.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifeServiceImp implements LifeService {
    @Autowired
    private LifeMapper lifeMapper;

    @Override
    public void insert(Life life) {
        lifeMapper.insert(life);
    }

    @Override
    public void update(Life life) {
        lifeMapper.updateByPrimaryKey(life);
    }

    @Override
    public void delete(Life life) {
        lifeMapper.deleteByPrimaryKey(life.getId());
    }

    @Override
    public List<Life> selectAll() {
        return lifeMapper.selectByExample(null);
    }

    @Override
    public List<Life> selectByBelongTo(Life life) {
        LifeExample lifeExample = new LifeExample();
        LifeExample.Criteria criteria = lifeExample.createCriteria();
        criteria.andBelongtoEqualTo(life.getBelongto());
        return lifeMapper.selectByExample(lifeExample);
    }
}
