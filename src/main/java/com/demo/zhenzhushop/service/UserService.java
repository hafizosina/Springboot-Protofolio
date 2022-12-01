package com.demo.zhenzhushop.service;

import com.demo.zhenzhushop.dto.product.ListProductRs;
import com.demo.zhenzhushop.dto.user.ListUserRs;
import com.demo.zhenzhushop.dto.user.UserSignUpRq;
import com.demo.zhenzhushop.entity.Product;
import com.demo.zhenzhushop.entity.User;
import com.demo.zhenzhushop.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public ListUserRs getall() {
        List<User> userList = new ArrayList<>();
        try {
            userList = repository.findAll();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ListUserRs.builder()
                .userList(userList)
                .build();
    }
}
