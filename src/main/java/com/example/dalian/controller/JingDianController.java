package com.example.dalian.controller;

import com.example.dalian.common.Common;
import com.example.dalian.pojo.JingDian;
import com.example.dalian.service.JingDianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 张齐 on 2020/2/26 11:24
 */
@RestController
@RequestMapping("/jingdian")
public class JingDianController {
    @Autowired
    private JingDianService jingDianService;

    @RequestMapping("/search")
    public Common search(){
        List<JingDian> all = jingDianService.findAll();
        return new Common(200,"景点列表",all);

    }

}
