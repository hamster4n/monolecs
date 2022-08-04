package com.skachkov.monolecs.domain.entity;

import com.skachkov.monolecs.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String email;
    String password;
    String address;
    String phone;
    String name;
    String card;
    @Enumerated(EnumType.STRING)
    Role role;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carts_id", referencedColumnName = "id")
    CartEntity cart;
    @OneToMany(mappedBy = "user")
    List<OrderEntity> order;
}
