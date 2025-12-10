package com.ah.authservice.repository;

import com.ah.authservice.model.entity.AppUsers;
import com.ah.authservice.model.payload.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUsers, Long> {
    Boolean existsByEmail(String email);
    AppUsers findByEmail(String email);
}
