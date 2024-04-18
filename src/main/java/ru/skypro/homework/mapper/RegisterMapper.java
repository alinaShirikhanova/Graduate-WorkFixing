package ru.skypro.homework.mapper;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.Login;
import ru.skypro.homework.dto.Register;
import ru.skypro.homework.entity.AdEntity;

@Service
public class RegisterMapper {

    public Login loginToEntity(Login login) {
        Login loginEntity = new Login();
        loginEntity.setUsername(login.getUsername());
        loginEntity.setPassword(login.getPassword());
        return loginEntity;
    }

    public Register registerEntity(Register register) {
        return register;
    }

}
