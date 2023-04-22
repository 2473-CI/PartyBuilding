package com.ru.springboot3.mapper;

import com.ru.springboot3.model.Expand;
import com.ru.springboot3.model.ExpandExample;
import java.util.List;
import java.util.Map;

import com.ru.springboot3.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExpandMapper {

    long countByExample(ExpandExample example);

    int deleteByExample(ExpandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Expand record);

    int insertSelective(Expand record);

    List<Expand> selectByExample(ExpandExample example);

    Expand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Expand record, @Param("example") ExpandExample example);

    int updateByExample(@Param("record") Expand record, @Param("example") ExpandExample example);

    int updateByPrimaryKeySelective(Expand record);

    int updateByPrimaryKey(Expand record);
}