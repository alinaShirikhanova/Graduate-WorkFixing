package ru.skypro.homework.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.rq.user.NewPassword;
import ru.skypro.homework.entity.UserEntity;
import ru.skypro.homework.repository.UserRepository;
import ru.skypro.homework.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void setPassword(NewPassword newPassword, Authentication authentication) {
        Optional<UserEntity> user = userRepository.findByUsername(authentication.getName());
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("Такого пользователя не найдено");
        } else if (user.get().getPassword().equals(newPassword.getCurrentPassword())) {
            userRepository.save(user.get().setPassword(newPassword.getNewPassword()));
        }
    }
}
