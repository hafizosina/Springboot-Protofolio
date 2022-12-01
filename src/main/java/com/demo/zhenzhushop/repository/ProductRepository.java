package com.demo.zhenzhushop.repository;

import com.demo.zhenzhushop.entity.Product;
import com.demo.zhenzhushop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
