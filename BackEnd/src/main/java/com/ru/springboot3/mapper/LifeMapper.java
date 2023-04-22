package com.ru.springboot3.mapper;

import com.ru.springboot3.model.Life;
import com.ru.springboot3.model.LifeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface LifeMapper {
    long countByExample(LifeExample example);

    int deleteByExample(LifeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Life record);

    int insertSelective(Life record);

    List<Life> selectByExampleWithBLOBs(LifeExample example);

    List<Life> selectByExample(LifeExample example);

    Life selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Life record, @Param("example") LifeExample example);

    int updateByExampleWithBLOBs(@Param("record") Life record, @Param("example") LifeExample example);

    int updateByExample(@Param("record") Life record, @Param("example") LifeExample example);

    int updateByPrimaryKeySelective(Life record);

    int updateByPrimaryKeyWithBLOBs(Life record);

    int updateByPrimaryKey(Life record);
}