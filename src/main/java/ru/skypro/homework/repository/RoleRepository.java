package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.entity.RoleEntity;
@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
}
