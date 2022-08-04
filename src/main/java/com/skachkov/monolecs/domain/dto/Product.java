package com.skachkov.monolecs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long Id;
    private String name;
    private String description;
    private Integer price;
    private Integer quantityInStock;
    private List<CartProduct> cartProducts;
}
