package com.fun90.globe.door.controller;

import com.fun90.globe.door.model.entity.User;
import com.fun90.globe.door.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class AuthController {
    
    private final UserService userService;

    @GetMapping("/api/user")
    @ResponseBody
    public ResponseEntity<?> getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String email = authentication.getName();
            Optional<User> user = userService.findByEmail(email);
            if (user.isPresent()) {
                return ResponseEntity.ok(userService.convertToDto(user.get()));
            }
        }
        return ResponseEntity.badRequest().body("User not authenticated");
    }
}