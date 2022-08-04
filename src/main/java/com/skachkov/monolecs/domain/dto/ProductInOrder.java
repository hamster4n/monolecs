package com.skachkov.monolecs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInOrder {

    private Long id;
    private String name;
    private String description;
    private Integer frozenPrice;
    private Order order;
}
