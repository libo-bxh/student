package com.base;

import java.util.List;

/**
 * @version 1.0
 * @Author: Beau li
 * @Date: Created in 0:19 2020/6/15
 */
public class ActionResult {
    private String messages;
    private int code = 200;
    private int total = 1;
    private Object result = "";
    private int totalPages = 1;


    public static final ActionResult SUCCESS = ActionResult.data(true);

    public static ActionResult data(Object o) {
        return ActionResult.dataWithMsg(o, "执行成功");
    }

    public static ActionResult dataWithMsg(Object o, String msg) {
        ActionResult ret = new ActionResult();
        ret.code = 200;
        ret.result = o;
        if (o instanceof List) {
            ret.total = ((List<?>) o).size();
        }
        ret.messages = msg;
        return ret;
    }


    public static ActionResult error(String msg) {
        ActionResult ret = new ActionResult();
        ret.code = -1;
        ret.messages = msg;
        return ret;
    }

    public boolean success() {
        return code == 200;
    }

    public ActionResult() {
        super();
    }

    public int getTotal() {
        if (result instanceof List) {
            List<?> reList = (List<?>) result;
            return reList.size();
        }
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static ActionResult failure(String msg) {
        ActionResult result = new ActionResult();
        result.setCode(RetCode.FAILURE.getCode());
        result.setMessages(msg);
        return result;
    }

    public static ActionResult failed(Object o, String msg) {
        ActionResult result = new ActionResult();
        result.setCode(RetCode.FAILURE.getCode());
        result.setMessages(msg);
        result.setResult(o);
        return result;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public static ActionResult getSUCCESS() {
        return SUCCESS;
    }

    @Override
    public String toString() {
        return "ActionResult{" +
                "messages='" + messages + '\'' +
                ", code=" + code +
                ", total=" + total +
                ", result=" + result +
                ", totalPages=" + totalPages +
                '}';
    }
}
