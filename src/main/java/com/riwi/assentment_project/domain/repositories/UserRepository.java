package com.riwi.assentment_project.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.assentment_project.domain.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
}
