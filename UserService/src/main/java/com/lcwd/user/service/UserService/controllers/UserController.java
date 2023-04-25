package com.lcwd.user.service.UserService.controllers;


import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    //create

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) //DESERIEALIZED USER FROM JSON USER OBJECT
    {

        User user1=userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);


    }

    @GetMapping("/{Id}")
    public ResponseEntity<User> getUser(@PathVariable String Id)
    {
        User user2= userService.getUser(Id);
        return ResponseEntity.ok(user2);


    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers()
    {
        List<User> list=userService.getAllUser();
        return ResponseEntity.ok(list);
    }

}
