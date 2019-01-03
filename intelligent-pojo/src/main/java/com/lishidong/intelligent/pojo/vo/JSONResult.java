package com.lishidong.intelligent.pojo.vo;

/**
 * 前端RESTFul交互统一格式
 */
public class JSONResult {

    /**
     * 成功时返回数据
     * @param data
     * @return
     */
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(0);
        result.setMsg(null);
        result.setData(data);
        return result;
    }

    public static Result success(Integer error,Object data){
        Result result = new Result();
        result.setCode(error);
        result.setMsg(null);
        result.setData(data);
        return result;
    }


    /**
     * 失败时返回错误码与错误信息
     * @param error
     * @param message
     * @return
     */
    public static Result fail(Integer error,String message){
        Result result = new Result();
        result.setCode(error);
        result.setMsg(message);
        result.setData(null);
        return result;
    }
}
