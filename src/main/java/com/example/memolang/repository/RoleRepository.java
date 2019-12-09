package com.example.memolang.repository;

import com.example.memolang.entities.registration.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(String role);

}