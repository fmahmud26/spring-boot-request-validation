package com.example.springbootrequestvalidationexample.repository;


import com.example.springbootrequestvalidationexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(long userId);
}
