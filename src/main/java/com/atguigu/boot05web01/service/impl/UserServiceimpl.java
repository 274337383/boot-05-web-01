package com.atguigu.boot05web01.service.impl;

import com.atguigu.boot05web01.entity.User;
import com.atguigu.boot05web01.mapper.UserMapper;
import com.atguigu.boot05web01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}