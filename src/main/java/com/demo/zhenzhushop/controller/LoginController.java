package com.demo.zhenzhushop.controller;


import com.demo.zhenzhushop.dto.user.UserSignUpRq;
import com.demo.zhenzhushop.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    LoginService  service;

    @PostMapping("/logintest")
    public Boolean login(@RequestBody String request){
        return service.login(request);
    }

    @PostMapping("/signup")
    public Boolean signup(@RequestBody UserSignUpRq request){
        return service.signup(request);
    }

}
