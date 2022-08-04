package com.skachkov.monolecs.domain.repository;

import com.skachkov.monolecs.domain.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
