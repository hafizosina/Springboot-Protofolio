package com.demo.zhenzhushop.controller;


import com.demo.zhenzhushop.dto.product.ListProductRs;
import com.demo.zhenzhushop.dto.user.UserSignUpRq;
import com.demo.zhenzhushop.entity.Product;
import com.demo.zhenzhushop.service.LoginService;
import com.demo.zhenzhushop.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "product" )
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/getall")
    public ListProductRs login(){
        return service.getall();
    }

//    @GetMapping("/get/{id}")
//    public Product

}
