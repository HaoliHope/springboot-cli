package com.lh.bean.vo;

import lombok.Data;

/**
 * 数据返回格式
 *
 * @author lihao3
 */
@Data
public class Result {

    /**
     * 是否成功
     */
    private boolean flag;

    /**
     * 返回语
     */
    private String mag;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 时间戳
     */
    private Long timeStamp;

    public Result() {
        super();
    }

    public Result(boolean flag, String mag, Long timeStamp) {
        this.flag = flag;
        this.mag = mag;
        this.timeStamp = timeStamp;
    }

    public Result(boolean flag, String mag, Object data, Long timeStamp) {
        this.flag = flag;
        this.mag = mag;
        this.data = data;
        this.timeStamp = timeStamp;
    }

    public Result success() {
        return new Result(true, "操作成功", System.currentTimeMillis());
    }

    public Result success(Object data) {
        return new Result(true, "操作成功", data, System.currentTimeMillis());
    }

    public Result error() {
        return new Result(false, "网络出小差了，请稍后再试", System.currentTimeMillis());
    }
}
