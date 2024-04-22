package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class UpdateUser {
    /**
     * Поля относящиеся к сущности UserEntity
     */
    private String lastName;
    private String phone;
    private String firstName;
}
