package com.lh.web.controller;

import com.lh.bean.vo.Result;
import io.swagger.annotations.Api;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("登陆接口")
@RestController
public class LoginController {

    @PostMapping("/login")
    @PreAuthorize("hasAuthority('aaa:save')")
    public Result login(){
        return new Result().success();
    }
}
