package com.lakala.bigdata.rt.cdc.generator.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author aaron
 * @Description TODO
 * @createTime 2021-11-30 12:42:00
 */
@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtils.context = applicationContext;
    }

    public static <T> T getBean(Class<T> clz) {
        return context.getBean(clz);
    }

    public static Object getBean(String name) {
        return context.getBean(name);
    }

    public ApplicationContext getApplicationContext() {
        return context;
    }

}