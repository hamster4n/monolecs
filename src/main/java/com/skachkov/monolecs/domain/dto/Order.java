package com.skachkov.monolecs.domain.dto;

import com.skachkov.monolecs.domain.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;
    private LocalDateTime created;
    private LocalDateTime lastChange;
    private LocalDateTime completed;
    private String address;
    private OrderStatus status;
    private User user;
    private List<ProductInOrder> productsInOrder;
    private Integer sum;
}
