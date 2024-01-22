package com.fsba.foodsupplierbackendapi.controllers;

import com.fsba.foodsupplierbackendapi.auth.ChangeEmailRequest;
import com.fsba.foodsupplierbackendapi.auth.ChangePasswordRequest;
import com.fsba.foodsupplierbackendapi.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/users")
@Tag(name = "Users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @Operation(
            description = "PATCH endpoint for users",
            summary = "Patch endpoint to change de user email"

    )
    @PatchMapping("/change-email")
    public ResponseEntity<?> changeEmail(@RequestBody ChangeEmailRequest request, Principal connectedUser) {
        userService.changeEmail(request, connectedUser);
        return ResponseEntity.ok().build();
    }
    @Operation(
            description = "PATCH endpoint for users",
            summary = "Patch endpoint to change the user password"

    )
    @PatchMapping("/change-password")
    public ResponseEntity<?> changePassword(@RequestBody ChangePasswordRequest request, Principal connectedUser) {
        userService.changePassword(request, connectedUser);
        return ResponseEntity.ok().build();
    }
}