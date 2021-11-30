package com.lakala.bigdata.rt.cdc.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author aaron
 * @Description TODO
 * @createTime 2021-11-30 13:23:00
 */
@EnableCaching
@EnableScheduling
@ComponentScan(basePackages = "com.lakala.bigdata.rt.cdc.generator")
@EnableTransactionManagement
@SpringBootApplication
public class ScheduledApplication {
    private static Logger logger = LoggerFactory.getLogger(ScheduledApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class, args);
        logger.info("程序启动完成.");
    }

}