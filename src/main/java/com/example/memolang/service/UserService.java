package com.example.memolang.service;

import com.example.memolang.entities.registration.User;

public interface UserService{

    public void registerUser(User user);

    public User findByUsername(String username);

    public void deleteById(Long id);

    public void updateUser(User user);

    void userCheck(User user);


    //public String userActivation(String code);

}
