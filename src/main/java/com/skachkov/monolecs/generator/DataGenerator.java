package com.skachkov.monolecs.generator;

import com.skachkov.monolecs.domain.Role;
import com.skachkov.monolecs.domain.entity.CartEntity;
import com.skachkov.monolecs.domain.entity.UserEntity;
import com.skachkov.monolecs.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@Component
@RequiredArgsConstructor
public final class DataGenerator {

    private final UserRepository userRepository;

    public void generateUsers() {
        userRepository.deleteAll();

        CartEntity cart1 = new CartEntity(null, null, new ArrayList<>());
        UserEntity user1 = new UserEntity(null, "first.user@gmail.com", "password", "address",
                "phone", "name", "card", Role.USER, cart1, new ArrayList<>());
        cart1.setUser(user1);
        userRepository.save(user1);

        CartEntity cart2 = new CartEntity(null, null, new ArrayList<>());
        UserEntity user2 = new UserEntity(null, "second.user@gmail.com", "password2", "address2",
                "phone2", "name2", "card2", Role.USER, cart2, new ArrayList<>());
        cart2.setUser(user2);
        userRepository.save(user2);

        CartEntity cart3 = new CartEntity(null, null, new ArrayList<>());
        UserEntity user3 = new UserEntity(null, "third.user@gmail.com", "password3", "address3",
                "phone3", "name3", "card3", Role.MANAGER, cart3, new ArrayList<>());
        cart3.setUser(user3);
        userRepository.save(user3);

        CartEntity cart4 = new CartEntity(null, null, new ArrayList<>());
        UserEntity user4 = new UserEntity(null, "forth.user@gmail.com", "password4", "address4",
                "phone4", "name4", "card4", Role.ADMIN, cart4, new ArrayList<>());
        cart4.setUser(user4);
        userRepository.save(user4);
    }


}
