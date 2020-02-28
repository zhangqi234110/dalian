package com.example.dalian.mapper;

import com.example.dalian.pojo.User;

/**
 * Created by 张齐 on 2020/2/27 9:19
 */
public interface UserMapper {
    User find(String name);
}
