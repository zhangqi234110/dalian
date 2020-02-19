package com.example.dalian.controller;

import com.alibaba.fastjson.JSON;
import com.example.dalian.common.Common;
import com.example.dalian.tools.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张齐 on 2020/2/19 15:43
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    /*
    * 天气查询
    * */
    @RequestMapping("/search")
    public Common search(@RequestParam("city") String  city){
        String s = HttpRequest.sendGet("http://v.juhe.cn/weather/index", "cityname="+city+"&key=8a8b93293158961596749bb01b7ab2c0");
        Object s1 = JSON.parse(s);
        return new Common(200,"成功返回",s1);


    }

}
