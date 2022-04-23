package com.example.springbootrequestvalidationexample.controller;

import com.example.springbootrequestvalidationexample.dto.UserRequest;
import com.example.springbootrequestvalidationexample.entity.User;
import com.example.springbootrequestvalidationexample.exception.NoUserFoundInDatabaseException;
import com.example.springbootrequestvalidationexample.exception.UserNotFoundException;
import com.example.springbootrequestvalidationexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest req) {
        return new ResponseEntity<>(service.saveUser(req), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() throws NoUserFoundInDatabaseException {
        return ResponseEntity.ok(service.getAllUsers());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable long userId) throws UserNotFoundException {
        return ResponseEntity.ok(service.getUserById(userId));
    }
}
