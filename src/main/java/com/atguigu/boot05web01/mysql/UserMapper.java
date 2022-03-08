package com.atguigu.boot05web01.mysql;


import com.atguigu.boot05web01.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    @Select("select * from user order by username")
    List<User> getUserList();

    @Insert("insert into test.user(username,password,address,age,sex) values(#{username},#{password},#{address},#{age},#{sex})")
    int AddUser(User user);
}