package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class User {
    /**
     * Поля относящиеся к сущности UserEntity
     */
    private Integer id;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String phone;
    private String image;
    /**
     * Поля относящиеся к сущности RoleEntity
     */
    private Role role;

}
