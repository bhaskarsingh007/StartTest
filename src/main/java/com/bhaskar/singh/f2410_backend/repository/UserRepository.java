package com.bhaskar.singh.f2410_backend.repository;

import com.bhaskar.singh.f2410_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String username);
}
