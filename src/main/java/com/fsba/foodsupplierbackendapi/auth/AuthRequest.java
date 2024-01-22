package com.fsba.foodsupplierbackendapi.auth;

import com.fsba.foodsupplierbackendapi.security.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    private String email;
    String password;
}
