package ru.skypro.homework.dto.rq.comment;

import lombok.Data;

@Data
public class Comment {
    private Integer author;
    private String authorImage;
    private String authorFirstName;
    private Long createdAt;
    private Integer id;
    private String text;
}
