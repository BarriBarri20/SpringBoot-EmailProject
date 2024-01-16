package me.akrem.email_project.users.DTO;
//Data Transfer Object

import lombok.Data;
@Data
public class Login {
    private String usernameOrEmail;
    private String password;
}

