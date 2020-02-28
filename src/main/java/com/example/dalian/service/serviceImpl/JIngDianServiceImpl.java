package com.example.dalian.service.serviceImpl;

import com.example.dalian.mapper.JingDianMapper;
import com.example.dalian.pojo.JingDian;
import com.example.dalian.service.JingDianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张齐 on 2020/2/26 11:21
 */
@Service
public class JIngDianServiceImpl implements JingDianService {

    @Autowired
    private  JingDianMapper jingDianMapper;

    @Override
    public List<JingDian> findAll() {
        List<JingDian> all = jingDianMapper.findAll();
        return all;
    }
}
