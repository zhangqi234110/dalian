package com.example.dalian.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张齐 on 2020/2/19 15:10
 */
@RestController
@RequestMapping("/dalian")
public class HelloController {
    @RequestMapping("/welcome")
    public String  wel(){

        return "你好，大连！";
    }

}
