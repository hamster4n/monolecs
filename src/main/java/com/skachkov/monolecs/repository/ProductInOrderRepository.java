package com.skachkov.monolecs.repository;

import com.skachkov.monolecs.domain.entity.ProductInOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInOrderRepository extends JpaRepository<ProductInOrderEntity, Integer> {
}
