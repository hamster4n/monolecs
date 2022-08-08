package com.skachkov.monolecs.service;

import com.skachkov.monolecs.domain.dto.User;
import com.skachkov.monolecs.domain.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity create(User user);

    UserEntity update(User user);

    void delete(Integer userId);

    User getById(Integer userId);

    List<User> getAll();
}
