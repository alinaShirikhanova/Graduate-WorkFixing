package ru.skypro.homework.mapper;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.UpdateUser;
import ru.skypro.homework.dto.User;
import ru.skypro.homework.entity.RoleEntity;
import ru.skypro.homework.entity.UserEntity;
import ru.skypro.homework.repository.RoleRepository;
import ru.skypro.homework.repository.UserRepository;

@Service
public class UserMapper {

    public UpdateUser updateUserToEntity(UserEntity userEntity) {
        UpdateUser updateUserToEntity = new UpdateUser();
        updateUserToEntity.setUsername(userEntity.getUsername());
        updateUserToEntity.setFirstName(userEntity.getFirstName());
        updateUserToEntity.setPhone(userEntity.getPhone());
        return updateUserToEntity;
    }

    public User userToEntity(UserEntity userEntity) {
        User userDtoToEntity = new User();
        userDtoToEntity.setId(userEntity.getId());
        userDtoToEntity.setEmail(userEntity.getEmail());
        userDtoToEntity.setFirstName(userEntity.getFirstName());
        userDtoToEntity.setLastName(userEntity.getLastName());
        userDtoToEntity.setPhone(userEntity.getPhone());
        userDtoToEntity.setImage(userEntity.getImage());
        return userDtoToEntity;
    }

}
