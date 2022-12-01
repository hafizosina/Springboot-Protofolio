package com.demo.zhenzhushop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT")
@Slf4j
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUCT")
    private Long idProduct;

    @Column(name = "NAME")
    private String name;

    @Column(name = "KATEGORI")
    private String kategori;

    @Column(name = "DESKRIPSI")
    private String deskripsi;

    @Column(name = "HARGA")
    private Long harga;

}
