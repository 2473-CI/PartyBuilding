package com.ru.springboot3.mapper;

import com.ru.springboot3.model.User;
import com.ru.springboot3.model.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("""
        SELECT *
        FROM `user`
        WHERE `role` = '发展党员' AND belongTo=#{belongto}
        AND `id` NOT IN (
          SELECT `to`
          FROM `expand`
        )
        """)
    List<User> toBeDeveloped(User user);

    @Select("""
       SELECT *
        FROM `user`
        WHERE (`role` = '党员' OR `role` = '基层支部书记' OR `role` = '分团委老师') AND belongTo=#{belongto}
        """)
    List<User> partyMember(User user);

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}