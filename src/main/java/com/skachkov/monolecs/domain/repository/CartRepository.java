package com.skachkov.monolecs.domain.repository;

import com.skachkov.monolecs.domain.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Integer> {
}
