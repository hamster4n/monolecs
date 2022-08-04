package com.skachkov.monolecs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    private Long id;
    private User user;
    private List<CartProduct> cartProducts;
}
