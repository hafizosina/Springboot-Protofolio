package com.demo.zhenzhushop.service;

import com.demo.zhenzhushop.dto.product.ListProductRs;
import com.demo.zhenzhushop.dto.user.UserSignUpRq;
import com.demo.zhenzhushop.entity.Product;
import com.demo.zhenzhushop.repository.ProductRepository;
import com.demo.zhenzhushop.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public ListProductRs getall() {
        List<Product> productList = new ArrayList<>();
        try {
            productList = repository.findAll();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ListProductRs.builder()
                .productList(productList)
                .build();
    }
}
