package com.demo.zhenzhushop.repository;

import com.demo.zhenzhushop.entity.Cart;
import com.demo.zhenzhushop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
}
