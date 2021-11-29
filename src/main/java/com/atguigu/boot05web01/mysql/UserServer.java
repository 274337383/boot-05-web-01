package com.atguigu.boot05web01.mysql;

import com.atguigu.boot05web01.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServer {

    List<User> getUserList();
    String AddUser(User user);
}