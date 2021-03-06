package com.example.demo.demo;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        //参数: 1.具体执行的任务 2.首次执行的延时时间
        //   3.任务执行间隔 4.间隔时间单位
        executorService.scheduleAtFixedRate(() ->
                System.out.println("执行任务A" + LocalDateTime.now()), 0, 3, TimeUnit.SECONDS);
    }

}
