package com.example.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author jiawei.zhao
 * @Data 2020/5/29
 */
public class ExampleJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("111111111111111111111111111111111111111111111111111111111111111111");
    }
}
