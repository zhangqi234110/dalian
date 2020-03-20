package com.example.dalian.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by 张齐 on 2020/3/20 14:33
 */
@Component
public class Job1 extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Random random = new Random();
        int i = random.nextInt(100);
        Jedis jedis = new Jedis("localhost");
        jedis.set("大连市"+i+"","美美哒");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("TestQuartz01----" + sdf.format(new Date())+"你好啊，我来了");
    }
}
