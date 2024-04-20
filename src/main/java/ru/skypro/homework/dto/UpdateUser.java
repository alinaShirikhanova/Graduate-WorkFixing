package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class UpdateUser {
    /**
     * Поля относящиеся к сущности UserEntity
     */
    private String username;
    private String phone;
    private String firstName;
}
