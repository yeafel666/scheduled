package com.yeafel.scheduled.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Yeafel
 * Scheduled定时任务
 * 2019/10/10 11:14
 * Do or Die,To be a better man!
 */
@Component
public class ScheduledDemo {


    /**
     * 定时任务方法
     * @Scheduled:  设置定时任务，表示当前方法会作为定时任务
     * cron属性： cron表达式。定时任务触发时间的一个字符串表达形式
     *               //秒 分 时天月
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduledMethod() {
        System.out.println("定时器触发" + new Date());
    }
}
