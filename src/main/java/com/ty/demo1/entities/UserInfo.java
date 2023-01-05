package com.ty.demo1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer age;

    public UserInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}