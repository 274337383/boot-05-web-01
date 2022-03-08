package com.atguigu.boot05web01.mysql.serverimpl;

import com.atguigu.boot05web01.mysql.UserMapper;
import com.atguigu.boot05web01.mysql.UserServer;
import com.atguigu.boot05web01.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserServerimpl implements UserServer {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {

        return userMapper.getUserList();
    }

    @Override
    public String AddUser(User user) {

        int i = userMapper.AddUser(user);
        return "添加成功" + i + "条数据";
    }
}