package com.skachkov.monolecs.mapper;

import com.skachkov.monolecs.domain.dto.User;
import com.skachkov.monolecs.domain.entity.UserEntity;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
@NoArgsConstructor
public abstract class UserMapper {
    public abstract User entityToDto(UserEntity entity);
    public abstract UserEntity dtoToEntity(User dto);

    public abstract List<User> entitiesToDtos(List<UserEntity> entities);
}
