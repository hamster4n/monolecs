package com.skachkov.monolecs.domain.repository;

import com.skachkov.monolecs.domain.entity.ProductInOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInOrderRepository extends JpaRepository<ProductInOrderEntity, Integer> {
}
