package com.example.homework4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.homework4.mapper")
@SpringBootApplication
public class Homework4Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework4Application.class, args);
    }

}
