package com.lakala.bigdata.rt.cdc.generator.schedule.task;

import com.lakala.bigdata.rt.cdc.generator.schedule.ScheduledOfTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author aaron
 * @Description TODO
 * @createTime 2021-11-30 12:54:00
 */
@Component
public class OrgGeneratorTask implements ScheduledOfTask {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private int i;

    @Override
    public void execute() {
        logger.info("thread id:{},DynamicPrintTask execute times:{}", Thread.currentThread().getId(), ++i);
    }
}
