package ru.skypro.homework.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "ads")
public class AdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UserEntity author;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "pk", nullable = false)
    private Integer pk;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "title", nullable = false)
    private String title;
}
