package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import ru.skypro.homework.dto.Role;
import ru.skypro.homework.dto.UpdateUser;
import ru.skypro.homework.dto.User;
import ru.skypro.homework.entity.RoleEntity;
import ru.skypro.homework.entity.UserEntity;
import ru.skypro.homework.repository.UserRepository;

@Mapper(componentModel = "spring")
public abstract class MapperUser {
    @Autowired
    UserRepository userRepository;


//    UpdateUser updateUserToEntity(UserEntity userEntity);
//    User userToEntity(UserEntity userEntity);
@Mapping(target = "name", expression = "java(role.name())") //target - переменная объекта в которую мы мапим (expression - выражение, результат которого мы присвоим в target)
   public abstract RoleEntity roleToRoleEntity(Role role);




}
