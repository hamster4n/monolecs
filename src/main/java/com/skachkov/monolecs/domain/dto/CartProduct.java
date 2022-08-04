package com.skachkov.monolecs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartProduct {

    private Long id;
    private Cart cart;
    private Product product;
    private Integer productAmount;
}
