package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.StudyMapper;
import com.ru.springboot3.model.Study;
import com.ru.springboot3.model.StudyExample;
import com.ru.springboot3.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudyServiceImp implements StudyService {
    @Autowired
    private StudyMapper studyMapper;

    @Override
    public void insert(Study study) {
        studyMapper.insert(study);
    }

    @Override
    public void update(Study study) {
        studyMapper.updateByPrimaryKey(study);
    }

    @Override
    public void delete(Study study) {
        studyMapper.deleteByPrimaryKey(study.getId());
    }

    @Override
    public List<Study> selectByBelongTo(Study study) {
//        StudyExample studyExample = new StudyExample();
//        StudyExample.Criteria criteria = studyExample.createCriteria();
//        criteria.andBelongtoEqualTo(study.getBelongto());
        return studyMapper.selectByBelong(study);
    }

    @Override
    public List<Study> selectAll(Study study) {
        return studyMapper.selectByExample(null);
    }
}
