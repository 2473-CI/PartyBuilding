package com.ru.springboot3.mapper;

import com.ru.springboot3.model.Commend;
import com.ru.springboot3.model.CommendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommendMapper {
    long countByExample(CommendExample example);

    int deleteByExample(CommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commend record);

    int insertSelective(Commend record);

    List<Commend> selectByExampleWithBLOBs(CommendExample example);

    List<Commend> selectByExample(CommendExample example);

    Commend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commend record, @Param("example") CommendExample example);

    int updateByExampleWithBLOBs(@Param("record") Commend record, @Param("example") CommendExample example);

    int updateByExample(@Param("record") Commend record, @Param("example") CommendExample example);

    int updateByPrimaryKeySelective(Commend record);

    int updateByPrimaryKeyWithBLOBs(Commend record);

    int updateByPrimaryKey(Commend record);
}