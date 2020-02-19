package com.example.dalian.controller;

import com.example.dalian.common.Common;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张齐 on 2020/2/19 15:51
 */
@RestController
@RequestMapping("/university")
public class UniversityController {
    @RequestMapping("/gaoxiao")
    public Common school(){
        List school = new ArrayList<>();
        school.add("大连理工大学");
        school.add("大连海事大学");
        school.add("大连外国语大学");
        school.add("大连大学");
        school.add("东北财经大学");

        return new Common(200,"完毕",school);


    }
}
