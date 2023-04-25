package com.lcwd.user.service.UserService.services;

import com.lcwd.user.service.UserService.entities.User;

import java.util.List;

public interface UserService {

    //user operations

    //create user

    User saveUser(User user);

    //get all users

    List<User> getAllUser();

    //get user

    User getUser(String Id);

    //detele
    //update
}
