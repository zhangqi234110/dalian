package com.example.dalian.service.serviceImpl;

import com.example.dalian.mapper.UserMapper;
import com.example.dalian.pojo.User;
import com.example.dalian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 张齐 on 2020/2/27 9:23
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User find(String name) {
        return userMapper.find(name);
    }
}
