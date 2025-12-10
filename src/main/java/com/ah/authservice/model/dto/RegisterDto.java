package com.ah.authservice.model.dto;

import com.ah.authservice.model.enums.UserRole;
import lombok.Data;

@Data
public class RegisterDto {
    private String email;
    private String password;
    private String displayName;
    private UserRole role;
}
