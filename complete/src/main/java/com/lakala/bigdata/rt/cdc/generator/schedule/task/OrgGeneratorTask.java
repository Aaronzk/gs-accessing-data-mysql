package com.lakala.bigdata.rt.cdc.generator.schedule.task;

import com.lakala.bigdata.rt.cdc.generator.entity.MmsOrgInfo;
import com.lakala.bigdata.rt.cdc.generator.entity.MmsOrgInfoBuilder;
import com.lakala.bigdata.rt.cdc.generator.repository.MmsOrgInfoRepository;
import com.lakala.bigdata.rt.cdc.generator.schedule.ScheduledOfTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

/**
 * @author aaron
 * @Description TODO
 * @createTime 2021-11-30 12:54:00
 */
@Component
public class OrgGeneratorTask extends ScheduledOfTask {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private int count =0;

    @Autowired
    MmsOrgInfoRepository mmsOrgInfoRepository;

    public void execute() {
        // 启动线程，创建实体，写入，sleep(random(10))，然后更新两次
        logger.info("thread id:{},DynamicPrintTask execute times:{}, 并行运行线程数量为{}", Thread.currentThread().getId(), count++, runningCount.get());
        for(int j = 0; j < 10000; j++) {
            long l = System.currentTimeMillis();
            MmsOrgInfo mmsOrgInfo = MmsOrgInfoBuilder.newOrg(String.valueOf(l), Integer.valueOf(String.valueOf(l % 300)));
            mmsOrgInfoRepository.save(mmsOrgInfo);
            mmsOrgInfo.setStatus("02");
            mmsOrgInfo.setVer(2);
            mmsOrgInfo.setLastModifyTm(Instant.now());
            mmsOrgInfoRepository.save(mmsOrgInfo);
            mmsOrgInfo.setStatus("03");
            mmsOrgInfo.setVer(3);
            mmsOrgInfo.setLastModifyTm(Instant.now());
            mmsOrgInfoRepository.save(mmsOrgInfo);
        }
    }
}
