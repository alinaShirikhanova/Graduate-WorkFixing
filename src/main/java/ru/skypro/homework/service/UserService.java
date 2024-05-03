package ru.skypro.homework.service;

import org.springframework.security.core.Authentication;
import ru.skypro.homework.dto.rq.user.NewPassword;

public interface UserService {
    void setPassword(NewPassword newPassword, String username);
}
