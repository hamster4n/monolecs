package com.skachkov.monolecs.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "carts")
public class
CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @OneToOne(mappedBy = "cart")
    UserEntity user;
    @OneToMany(mappedBy = "cart")
    List<CartProductEntity> cartProducts;
}
