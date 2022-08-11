package com.example.springbootrequestvalidationexample.service;

import com.example.springbootrequestvalidationexample.dto.UserRequest;
import com.example.springbootrequestvalidationexample.entity.User;
import com.example.springbootrequestvalidationexample.exception.NoUserFoundInDatabaseException;
import com.example.springbootrequestvalidationexample.exception.UserNotFoundException;
import com.example.springbootrequestvalidationexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(UserRequest req) {
        User user = User.build(0, req.getName(), req.getEmail(), req.getMobile(), req.getGender(), req.getAge(), req.getNationality());
        return repository.save(user);
    }

    public List<User> getAllUsers() throws NoUserFoundInDatabaseException {
        List<User> users = repository.findAll();
        if (users.size() > 0) {
            return users;
        } else {
            throw new NoUserFoundInDatabaseException("No user found in database.");
        }
    }

    public User getUserById(long userId) throws UserNotFoundException {
        User user = repository.findByUserId(userId);
        if (user != null) {
            return user;
        } else {
            throw new UserNotFoundException("User not found with id : " + userId);
        }
    }
}
