package com.example.dalian.service.serviceImpl;

import com.example.dalian.mapper.HotMapper;
import com.example.dalian.pojo.Hot;
import com.example.dalian.service.HotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张齐 on 2020/3/20 15:12
 */
@Service
public class HotServiceImpl implements HotService {

    @Autowired
    private HotMapper hotMapper;

    @Override
    public List<Hot> findDesc() {
        List<Hot> desc = hotMapper.findDesc();
        return desc;
    }
}
