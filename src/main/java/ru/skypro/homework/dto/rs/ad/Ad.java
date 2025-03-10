package ru.skypro.homework.dto.rs.ad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ad {
    /**
     * Поля относящиеся к сущности UserEntity
     */
    private Integer author;
    /**
     * Поля относящиеся к сущности AdEntity
     */
    private String image;
    private Integer id;
    private Integer price;
    private String title;
}
