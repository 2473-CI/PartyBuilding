package com.ru.springboot3.mapper;

import com.ru.springboot3.model.Study;
import com.ru.springboot3.model.StudyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudyMapper {
    @Select("""
            SELECT * FROM study WHERE belongTo=#{belongto}
        """)
    List<Study> selectByBelong(Study study);

    long countByExample(StudyExample example);

    int deleteByExample(StudyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Study record);

    int insertSelective(Study record);

    List<Study> selectByExample(StudyExample example);

    Study selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByExample(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByPrimaryKeySelective(Study record);

    int updateByPrimaryKey(Study record);
}