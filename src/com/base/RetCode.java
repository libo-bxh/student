package com.base;

/**
 * @version 1.0
 * @Author: Beau li
 * @Date: Created in 0:22 2020/6/15
 */
public enum  RetCode {
    SUCCESS(0000,"执行成功"),
    FAILURE(9999,"执行失败"),;

    private int code;
    private String msg;
    RetCode(int i, String msg) {
        this.code = i;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
}
