package com.skachkov.monolecs.domain.dto;

import com.skachkov.monolecs.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String name;
    private String card;
    private Role role;
    private Cart cart;
    private List<Order> order;
}
