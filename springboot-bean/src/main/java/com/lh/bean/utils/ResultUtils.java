package com.lh.bean.utils;

import lombok.Builder;
import lombok.Data;

/**
 * @author lihao3
 */
@Data
@Builder
public class ResultUtils {

    private boolean success;
    private String message;
    private Object data;

    public static ResultUtils result(boolean success, String message, Object data) {
        return new ResultUtils(success, message, data);
    }

    public static ResultUtils success(Object data) {
        return new ResultUtils(true, "操作成功", data);
    }

    public static ResultUtils error(String message) {
        return new ResultUtils(false, message, null);
    }

    public static ResultUtils success(String message) {
        return new ResultUtils(true, message, null);
    }
}
