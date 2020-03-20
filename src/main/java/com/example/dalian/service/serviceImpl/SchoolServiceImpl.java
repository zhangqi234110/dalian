package com.example.dalian.service.serviceImpl;

import com.example.dalian.mapper.SchoolMapper;
import com.example.dalian.pojo.College;
import com.example.dalian.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张齐 on 2020/2/20 10:03
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public List<College> findAll() {
        List<College> all = schoolMapper.findAll();
        return all;
    }

    @Override
    public College findone(String name) {
        return schoolMapper.findone(name);
    }
}
