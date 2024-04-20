package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class CreateOrUpdateComment {
    /**
     * Поля относящиеся к сущности CommentEntity
     */
    private String text;
}
