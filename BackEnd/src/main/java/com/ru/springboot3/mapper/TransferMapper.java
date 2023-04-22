package com.ru.springboot3.mapper;

import com.ru.springboot3.model.Transfer;
import com.ru.springboot3.model.TransferExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TransferMapper {
    long countByExample(TransferExample example);

    int deleteByExample(TransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    List<Transfer> selectByExample(TransferExample example);

    Transfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByExample(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByPrimaryKeySelective(Transfer record);

    int updateByPrimaryKey(Transfer record);
}