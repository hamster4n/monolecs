package com.skachkov.monolecs.domain.repository;

import com.skachkov.monolecs.domain.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
