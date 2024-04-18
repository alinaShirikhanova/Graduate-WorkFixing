package ru.skypro.homework.mapper;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.UpdateUser;
import ru.skypro.homework.dto.User;

@Service
public class UserMapper {

    public UpdateUser updateUserToEntity(User user) {
        UpdateUser updateUser = new UpdateUser();
        updateUser.setUsername(user.getFirstName());
        updateUser.setFirstName(user.getLastName());
        updateUser.setPhone(user.getPhone());
        return updateUser;
    }

    public User userToEntity(User user) {
        User userEntity = new User();
        userEntity.setId(user.getId());
        userEntity.setEmail(user.getEmail());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setPhone(user.getPhone());
        userEntity.setRole(user.getRole());
        userEntity.setImage(user.getImage());
        return userEntity;
    }


}
