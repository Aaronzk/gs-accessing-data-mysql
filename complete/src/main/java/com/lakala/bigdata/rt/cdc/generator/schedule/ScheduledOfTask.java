package com.lakala.bigdata.rt.cdc.generator.schedule;

import com.lakala.bigdata.rt.cdc.generator.entity.SpringScheduledCron;
import com.lakala.bigdata.rt.cdc.generator.repository.SpringScheduledCronRepository;
import com.lakala.bigdata.rt.cdc.generator.util.SpringUtils;

/**
 * @author aaron
 * @Description TODO
 * @createTime 2021-11-30 12:37:00
 */
public interface ScheduledOfTask extends Runnable {
    /**
     * 定时任务方法
     */
    void execute();
    /**
     * 实现控制定时任务启用或禁用的功能
     */
    @Override
    default void run() {
        SpringScheduledCronRepository repository = SpringUtils.getBean(SpringScheduledCronRepository.class);
        SpringScheduledCron scheduledCron = repository.findByCronKey(this.getClass().getName());
        if (StatusEnum.DISABLED.getCode().equals(scheduledCron.getStatus())) {
            // 任务是禁用状态
            return;
        }
        execute();
    }
}