package com.atguigu.boot05web01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.boot05web01")
public class Boot05Web01Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot05Web01Application.class, args);
    }
}
