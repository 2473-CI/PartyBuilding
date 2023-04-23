package com.ru.springboot3.mapper;

import com.ru.springboot3.model.Help;
import com.ru.springboot3.model.HelpExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HelpMapper {
    long countByExample(HelpExample example);

    int deleteByExample(HelpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Help record);

    int insertSelective(Help record);

    List<Help> selectByExample(HelpExample example);

    Help selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Help record, @Param("example") HelpExample example);

    int updateByExample(@Param("record") Help record, @Param("example") HelpExample example);

    int updateByPrimaryKeySelective(Help record);

    int updateByPrimaryKey(Help record);
}