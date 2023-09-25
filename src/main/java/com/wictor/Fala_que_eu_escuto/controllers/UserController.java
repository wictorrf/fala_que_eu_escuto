package com.wictor.Fala_que_eu_escuto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wictor.Fala_que_eu_escuto.domains.Client;
import com.wictor.Fala_que_eu_escuto.domains.User;
import com.wictor.Fala_que_eu_escuto.dtos.UserDto;
import com.wictor.Fala_que_eu_escuto.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserDto data) throws Exception {
        User newUser = this.userService.registerUser(data);
        return ResponseEntity.status(HttpStatus.OK).body(newUser);
    }
}

