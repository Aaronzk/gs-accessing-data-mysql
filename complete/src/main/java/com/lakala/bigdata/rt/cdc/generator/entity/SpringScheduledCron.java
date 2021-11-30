package com.lakala.bigdata.rt.cdc.generator.entity;

import javax.persistence.*;

@Table(name = "spring_scheduled_cron", indexes = {
        @Index(name = "cron_key", columnList = "cron_key", unique = true)
}, uniqueConstraints = {
        @UniqueConstraint(name = "cron_key_unique_idx", columnNames = {"cron_key"})
})
@Entity
public class SpringScheduledCron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cron_id", nullable = false)
    private Integer id;

    @Column(name = "cron_key", nullable = false, length = 128)
    private String cronKey;

    @Column(name = "cron_expression", nullable = false, length = 20)
    private String cronExpression;

    @Column(name = "task_explain", nullable = false, length = 50)
    private String taskExplain;

    @Column(name = "status", nullable = false)
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTaskExplain() {
        return taskExplain;
    }

    public void setTaskExplain(String taskExplain) {
        this.taskExplain = taskExplain;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getCronKey() {
        return cronKey;
    }

    public void setCronKey(String cronKey) {
        this.cronKey = cronKey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}