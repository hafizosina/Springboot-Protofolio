package com.demo.zhenzhushop.service;

import com.demo.zhenzhushop.dto.user.UserSignUpRq;
import com.demo.zhenzhushop.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginService {

    @Autowired
    UserRepository userRepository;

    public Boolean login(String request) {
        log.info("dawdwadwa");
        return null;
    }

    public Boolean signup(UserSignUpRq request) {
        return true;
    }
}
