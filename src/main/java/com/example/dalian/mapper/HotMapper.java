package com.example.dalian.mapper;

import com.example.dalian.pojo.Hot;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 张齐 on 2020/3/20 15:06
 */
@Repository
public interface HotMapper {
    List<Hot> findDesc();
}
