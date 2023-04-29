package com.ru.springboot3.mapper;

import com.ru.springboot3.model.Examination;
import com.ru.springboot3.model.ExaminationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExaminationMapper {
    @Select("SELECT * FROM examination WHERE belongto=#{belongto}")
    List<Examination> selectByBelong(Examination examination);

    long countByExample(ExaminationExample example);

    int deleteByExample(ExaminationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Examination record);

    int insertSelective(Examination record);

    List<Examination> selectByExampleWithBLOBs(ExaminationExample example);

    List<Examination> selectByExample(ExaminationExample example);

    Examination selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByExampleWithBLOBs(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByExample(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByPrimaryKeySelective(Examination record);

    int updateByPrimaryKeyWithBLOBs(Examination record);

    int updateByPrimaryKey(Examination record);
}