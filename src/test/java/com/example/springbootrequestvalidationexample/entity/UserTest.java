package com.example.springbootrequestvalidationexample.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final User user = new User();

    private long userId = 1;
    private String name = "Demo";
    private String email = "demo@example.com";
    private String mobile = "12332123214";
    private String gender = "Male";
    private int age = 50;
    private String nationality = "Bangladeshi";

    @Test
    void test() {
        user.setUserId(userId);
        assertEquals(userId, user.getUserId());

        user.setName(name);
        assertEquals(name, user.getName());

        user.setEmail(email);
        assertEquals(email, user.getEmail());

        user.setGender(gender);
        assertEquals(gender, user.getGender());

        user.setAge(age);
        assertEquals(age, user.getAge());

        user.setMobile(mobile);
        assertEquals(mobile, user.getMobile());

        user.setNationality(nationality);
        assertEquals(nationality, user.getNationality());
    }

    @Test
    void testAllArg() {
        User user1 = User.build(userId, name, email, mobile, gender, age, nationality);

        assertEquals(userId, user1.getUserId());
        assertEquals(name, user1.getName());
        assertEquals(email, user1.getEmail());
        assertEquals(gender, user1.getGender());
        assertEquals(age, user1.getAge());
        assertEquals(mobile, user1.getMobile());
        assertEquals(nationality, user1.getNationality());
    }

}