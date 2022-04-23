package com.example.springbootrequestvalidationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "User name shouldn't be blank.")
    private String name;

    @Email(message = "Invalid email address entered.")
    @NotBlank
    private String email;

    @NotNull
    @Pattern(regexp = "^\\d{11}$", message = "Invalid mobile number entered.")
    private String mobile;

    @NotBlank
    private String gender;

    @Min(1)
    @Max(100)
    private int age;

    @NotBlank
    private String nationality;
}
