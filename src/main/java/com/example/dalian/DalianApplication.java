package com.example.dalian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dalian.mapper")
public class DalianApplication {

    public static void main(String[] args) {
        SpringApplication.run(DalianApplication.class, args);
    }

}
