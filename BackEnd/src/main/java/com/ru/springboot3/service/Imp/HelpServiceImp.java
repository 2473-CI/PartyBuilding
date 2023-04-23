package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.HelpMapper;
import com.ru.springboot3.model.Help;
import com.ru.springboot3.model.HelpExample;
import com.ru.springboot3.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpServiceImp implements HelpService {
    @Autowired
    private HelpMapper helpMapper;

    @Override
    public void insert(Help help) {
        helpMapper.insert(help);
    }

    @Override
    public void update(Help help) {
        helpMapper.updateByPrimaryKey(help);
    }

    @Override
    public void delete(Help help) {
        helpMapper.deleteByPrimaryKey(help.getId());
    }

    @Override
    public List<Help> selectAll() {
        return helpMapper.selectByExample(null);
    }

    @Override
    public List<Help> selectByBelongTo(Help help) {
        HelpExample helpExample = new HelpExample();
        HelpExample.Criteria criteria = helpExample.createCriteria();
        criteria.andHelperbelongtoEqualTo(help.getHelperbelongto());
        return helpMapper.selectByExample(helpExample);
    }
}
