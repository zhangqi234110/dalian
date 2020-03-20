package com.example.dalian.quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 张齐 on 2020/3/20 14:34
 */
@Configuration
public class QuartzConfig {

    @Bean
        public JobDetail testQuartz1() {
            return JobBuilder.newJob(Job1.class).withIdentity("job1").storeDurably().build();
        }

    @Bean
    public JobDetail HotJob() {
        return JobBuilder.newJob(HotJob.class).withIdentity("job2").storeDurably().build();
    }


    @Bean
        public Trigger testQuartzTrigger1() {
            //5秒执行一次
            SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                    .withIntervalInSeconds(3)
                    .repeatForever();
            return TriggerBuilder.newTrigger().forJob(HotJob())
                    .withIdentity("testTask2")
                    .withSchedule(scheduleBuilder)
                    .build();
        }


}
