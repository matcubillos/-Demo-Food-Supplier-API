package com.fsba.foodsupplierbackendapi.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChangeEmailRequest {

    private String currentPassword;
    private String newEmail;
    private String confirmationEmail;
}
