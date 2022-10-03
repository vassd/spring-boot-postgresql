package com.example.postgresqlspingboot.repository;

import com.example.postgresqlspingboot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The User repository.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
