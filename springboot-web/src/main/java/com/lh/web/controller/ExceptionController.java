package com.lh.web.controller;

import com.lh.bean.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 异常处理类
 *
 * @author lihao3
 */
@Slf4j
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public Result customException(Exception e) {
        log.debug("出现异常，原因为{}", e.getMessage());
        return new Result().error();
    }
}
