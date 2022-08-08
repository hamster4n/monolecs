package com.skachkov.monolecs.repository;

import com.skachkov.monolecs.domain.entity.CartProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepository extends JpaRepository<CartProductEntity, Integer> {
}
