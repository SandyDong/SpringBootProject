package com.dong.dao;

import com.dong.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 创建DAO操作接口类
 */

//加上该注解才能使用@MapperScan扫描到
@Mapper
public interface IUserDao {

    User getUserById(@Param("id") int id);

    int updateUser(@Param("user") User user);

    int insertUser(@Param("user") User user);

    int deleteUserById(@Param("id") int id);

}
