package ru.skypro.homework.mapper;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.rq.user.UpdateUser;
import ru.skypro.homework.dto.rs.user.User;
import ru.skypro.homework.entity.UserEntity;

@Service
public class UserMapper {

//    public User updateUserToEntity(UserEntity userEntity) {
//        UpdateUser updateUserToEntity = new UpdateUser();
//        updateUserToEntity.setLastName(userEntity.getLastName());
//        updateUserToEntity.setFirstName(userEntity.getFirstName());
//        updateUserToEntity.setPhone(userEntity.getPhone());
//        return updateUserToEntity;
//    }
//
//    public User userToEntity(UserEntity userEntity) {
//        User userDtoToEntity = new User();
//        userDtoToEntity.setId(userEntity.getId());
//        userDtoToEntity.setUsername(userEntity.getUsername());
//        userDtoToEntity.setFirstName(userEntity.getFirstName());
//        userDtoToEntity.setLastName(userEntity.getLastName());
//        userDtoToEntity.setPhone(userEntity.getPhone());
//        userDtoToEntity.setImage(userEntity.getImage());
//        return userDtoToEntity;
//    }

}
