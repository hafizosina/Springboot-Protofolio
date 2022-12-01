package com.demo.zhenzhushop.controller;


import com.demo.zhenzhushop.dto.product.ListProductRs;
import com.demo.zhenzhushop.dto.user.ListUserRs;
import com.demo.zhenzhushop.dto.user.UserSignUpRq;
import com.demo.zhenzhushop.service.LoginService;
import com.demo.zhenzhushop.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "user" )
public class UserController {

    @Autowired
    UserService service;


    @GetMapping("/getall")
    public ListUserRs login(){
        return service.getall();
    }


}
