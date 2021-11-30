package com.lakala.bigdata.rt.cdc.generator.schedule;

import com.lakala.bigdata.rt.cdc.generator.entity.SpringScheduledCron;
import com.lakala.bigdata.rt.cdc.generator.repository.SpringScheduledCronRepository;
import com.lakala.bigdata.rt.cdc.generator.util.SpringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author aaron
 * @Description TODO
 * @createTime 2021-11-30 12:37:00
 */
public abstract class ScheduledOfTask implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledOfTask.class);

    protected volatile AtomicInteger runningCount = new AtomicInteger(0);
    /**
     * 定时任务方法
     */
    protected abstract void execute();
    /**
     * 实现控制定时任务启用或禁用的功能
     */
    @Override
    public void run() {
        SpringScheduledCronRepository repository = SpringUtils.getBean(SpringScheduledCronRepository.class);
        SpringScheduledCron scheduledCron = repository.findByCronKey(this.getClass().getName());
        if (StatusEnum.DISABLED.getCode().equals(scheduledCron.getStatus())) {
            // 任务是禁用状态
            return;
        }
        if (!(scheduledCron.getMaxRunning() == 0) && runningCount.get() >= scheduledCron.getMaxRunning()) {
            logger.info("thread id:{},并行运行数量已经达到最大值.{}", Thread.currentThread().getId(), runningCount.get());
            return;
        }
        runningCount.incrementAndGet();
        execute();
        runningCount.decrementAndGet();
    }
}