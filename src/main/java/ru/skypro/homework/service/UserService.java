package ru.skypro.homework.service;

import ru.skypro.homework.dto.rq.user.NewPassword;
import ru.skypro.homework.dto.rq.user.UpdateUser;
import ru.skypro.homework.dto.rs.user.User;
import ru.skypro.homework.entity.UserEntity;

public interface UserService {
    void setPassword(NewPassword newPassword, String username);

    User getUser();

    UpdateUser updateUser(UpdateUser updateUser);

    UserEntity getCurrentUser();
}
