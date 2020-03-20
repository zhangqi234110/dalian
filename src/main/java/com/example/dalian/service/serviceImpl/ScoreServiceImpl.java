package com.example.dalian.service.serviceImpl;

import com.example.dalian.mapper.ScoreMapper;
import com.example.dalian.pojo.Score;
import com.example.dalian.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 张齐 on 2020/3/3 14:55
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public Score findScore(String name) {
        return scoreMapper.findScore(name);
    }
}
