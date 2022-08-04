package com.skachkov.monolecs.domain.repository;

import com.skachkov.monolecs.domain.entity.CartProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartProductRepository extends JpaRepository<CartProductEntity, Integer> {
}
