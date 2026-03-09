package com.agam.SpringSecEx.Repository;

import com.agam.SpringSecEx.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findByUsername(String username);
}
