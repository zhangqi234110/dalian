package com.example.dalian.controller;

import com.alibaba.fastjson.JSON;
import com.example.dalian.common.Common;
import com.example.dalian.tools.HttpRequest;
import com.example.dalian.tools.JuHe;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张齐 on 2020/2/26 11:42
 */
@RestController
@RequestMapping("/air")
public class AirController {

    @RequestMapping("/zhiliang")
    public Common air(@RequestParam("city") String city){
        JuHe juHe = new JuHe();
        Object air = juHe.getRequest1(city);
        /*String s = HttpRequest.sendGet("http://web.juhe.cn:8080/environment/air/pm", "cityname=" + city + "&key=60778bbde565e1b100fa1fe321b4f3b2");
        Object air = JSON.parse(s);*/
        return new Common(200,"空气质量",air);
    }
}
