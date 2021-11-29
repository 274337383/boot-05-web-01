package com.atguigu.boot05web01.controller;

import com.atguigu.boot05web01.model.User;
import com.atguigu.boot05web01.mysql.serverimpl.UserServerimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServerimpl userServer;

    @RequestMapping("/getuserlist")
    public List<User> getUserList()
    {
        return userServer.getUserList();
    }

    @PostMapping("/adduser")
    public String addUser(User user)
    {
        return userServer.AddUser(user);
    }
}