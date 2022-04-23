package com.example.springbootrequestvalidationexample.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRequestTest {

    private String name = "Demo";
    private String email = "demo@example.com";
    private String mobile = "12332123214";
    private String gender = "Male";
    private int age = 50;
    private String nationality = "Bangladeshi";

    private final UserRequest userRequest = new UserRequest();


    @Test
    void test() {
        userRequest.setAge(age);
        assertEquals(age, userRequest.getAge());

        userRequest.setEmail(email);
        assertEquals(email, userRequest.getEmail());

        userRequest.setGender(gender);
        assertEquals(gender, userRequest.getGender());

        userRequest.setMobile(mobile);
        assertEquals(mobile, userRequest.getMobile());

        userRequest.setName(name);
        assertEquals(name, userRequest.getName());

        userRequest.setNationality(nationality);
        assertEquals(nationality, userRequest.getNationality());
    }

    @Test
    void testForAllArg() {
        UserRequest userRequest1 = UserRequest.build(name, email, mobile, gender, age, nationality);
        assertEquals(name, userRequest1.getName());
        assertEquals(email, userRequest1.getEmail());
        assertEquals(mobile, userRequest1.getMobile());
        assertEquals(gender, userRequest1.getGender());
        assertEquals(age, userRequest1.getAge());
        assertEquals(nationality, userRequest1.getNationality());
    }

}