package ru.skypro.homework.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.skypro.homework.dto.Role;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(schema = "graduate", name = "users")
public class UserEntity {
    /**
     * Id пользователя
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Логин пользователя / его email
     */
    @Column(name = "email", unique = true)
    private String email;

    /**
     * Пароль пользователя
     */
    @Column(name ="password", unique = true)
    private String password;

    /**
     * Имя пользователя
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /**
     * Фамилия пользователя
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * Телефон пользователя
     */
    @Column(name = "phone", nullable = false)
    private String phone;

    /**
     * Ссылка на аватар пользователя
     */
    @Column(name = "image")
    private String image;

    /**
     * Комментарии пользователя
     */
    @JsonIgnore
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<CommentEntity> comments;

    /**
     * Объявления пользователя
     */
    @JsonIgnore
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private Set<AdEntity> ads;

    /**
     * Роль пользователя
     */
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private RoleEntity role;
}
