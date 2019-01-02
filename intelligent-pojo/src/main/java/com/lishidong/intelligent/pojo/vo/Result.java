package com.lishidong.intelligent.pojo.vo;

/**
 * 前端交互统一格式
 */
public class Result {

    private Integer error;

    private String message;

    private Object data;

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(Integer error) {
        this(error,null,null);
    }

    public Result(Integer error, String message) {
        this(error,message,null);
    }

    public Result(Integer error, String message, Object data) {
        this.error = error;
        this.message = message;
        this.data = data;
    }
}
