package com.demo.zhenzhushop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CART")
@Slf4j
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CART")
    private Long idCart;

    @ManyToOne
    @NotFound(action= NotFoundAction.IGNORE)
    @JoinColumn(name="ID_USER")
    private User idUser;


    @ManyToOne
    @NotFound(action= NotFoundAction.IGNORE)
    @JoinColumn(name="ID_PRODUCT")
    private Product idProduct;


}
