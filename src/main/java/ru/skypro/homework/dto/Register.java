package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class Register {
    /**
     *  Поля относящиеся к сущности UserEntity
     */
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    /**
     *  Поля относящиеся к ENUM RoleEntity
     */
    private Role role;
}
