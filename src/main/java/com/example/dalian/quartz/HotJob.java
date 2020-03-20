package com.example.dalian.quartz;

import com.example.dalian.mapper.HotMapper;
import com.example.dalian.pojo.Hot;
import com.example.dalian.tools.SerializeUtil;
import com.example.dalian.tools.Seriaz;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by 张齐 on 2020/3/20 15:14
 */
@Component
public class HotJob extends QuartzJobBean {

    @Autowired
    private HotMapper hotMapper;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        List<Hot> desc = hotMapper.findDesc();
        Jedis jedis = new Jedis("localhost");
        //jedis.set("热点数据".getBytes(), SerializeUtil.serializeList(desc));

            jedis.set(("热点数据1").getBytes(),Seriaz.serialize(desc.get(0)));
            jedis.set(("热点数据2").getBytes(),Seriaz.serialize(desc.get(1)));
            jedis.set(("热点数据3").getBytes(),Seriaz.serialize(desc.get(2)));



    }


}
