package com.citadelcult.citadelcult.user.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SignInRequest {
    @Size(min = 5, max = 255, message = "Email address must be between 5 and 255 characters")
    @NotBlank(message = "Email address cannot be blank")
    @Email(message = "Email address must be in the format user@example.com")
    private String email;

    @Size(min = 8, max = 255, message = "Password length must be between 8 and 255 characters")
    @NotBlank(message = "Password cannot be blank")
    private String password;
}