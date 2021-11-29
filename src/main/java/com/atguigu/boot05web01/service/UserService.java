package com.atguigu.boot05web01.service;

import com.atguigu.boot05web01.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}