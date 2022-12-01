package com.demo.zhenzhushop.dto.user;


import com.demo.zhenzhushop.entity.Role;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpRq {

    private static final long serialVersionUID = 437912143700577767L;


    private Long id;
    private String name;
    private Long idRole;
}
