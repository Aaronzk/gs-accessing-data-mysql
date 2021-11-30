package com.lakala.bigdata.rt.cdc.generator.schedule;

/**
 * @author aaron
 * @Description TODO
 * @createTime 2021-11-30 12:39:00
 */
public enum StatusEnum {

    ENABLED(1),
    DISABLED(2),
    ;

    private Integer code;

    StatusEnum(int code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}