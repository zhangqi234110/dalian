package com.example.dalian.controller;

import com.example.dalian.common.Common;
import com.example.dalian.pojo.College;
import com.example.dalian.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张齐 on 2020/2/19 15:51
 */
@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/gaoxiao")
    public Common school(){
        List<College> all = schoolService.findAll();
        return new Common(200,"完毕",all);
    }

    @RequestMapping("/score")
    public  Common score(String name){
        College findone = schoolService.findone(name);
        return  new Common(200,"fenshu",findone);
    }
}
