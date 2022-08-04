package com.skachkov.monolecs.domain.repository;

import com.skachkov.monolecs.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
