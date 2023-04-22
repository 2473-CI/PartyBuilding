package com.ru.springboot3.mapper;

import com.ru.springboot3.model.Cost;
import com.ru.springboot3.model.CostExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CostMapper {
    long countByExample(CostExample example);

    int deleteByExample(CostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cost record);

    int insertSelective(Cost record);

    List<Cost> selectByExample(CostExample example);

    Cost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cost record, @Param("example") CostExample example);

    int updateByExample(@Param("record") Cost record, @Param("example") CostExample example);

    int updateByPrimaryKeySelective(Cost record);

    int updateByPrimaryKey(Cost record);
}