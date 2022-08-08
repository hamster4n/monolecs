package com.skachkov.monolecs.service.impl;

import com.skachkov.monolecs.domain.dto.User;
import com.skachkov.monolecs.domain.entity.UserEntity;
import com.skachkov.monolecs.mapper.UserMapper;
import com.skachkov.monolecs.repository.UserRepository;
import com.skachkov.monolecs.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    UserMapper userMapper;

    @Override
    public UserEntity create(User user) {
        UserEntity userEntity = userMapper.dtoToEntity(user);
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity update(User user) {
        UserEntity userEntity = userMapper.dtoToEntity(user);
        return userRepository.save(userEntity);
    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User getById(Integer userId) {
        UserEntity userEntity = userRepository.getById(userId);
        return userMapper.entityToDto(userEntity);
    }

    @Override
    public List<User> getAll() {
        List<UserEntity> users = userRepository.findAll();
        return userMapper.entitiesToDtos(users);
    }
}
