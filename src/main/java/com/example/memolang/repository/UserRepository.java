package com.example.memolang.repository;


import com.example.memolang.entities.registration.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

   // Long deleteByUsername(String username);

    User findByActivation(String code);

    void deleteByUsername(User user);
}