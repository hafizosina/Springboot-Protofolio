package com.demo.zhenzhushop.dto.user;


import com.demo.zhenzhushop.entity.Product;
import com.demo.zhenzhushop.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListUserRs {

    private static final long serialVersionUID = -4396734200301310500L;

    List<User> userList;

//    private Long id;
//    private String name;
//    private String deskripsi;
//    private String kategory;
//    private Long harga;

}
