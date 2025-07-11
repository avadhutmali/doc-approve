package com.documentflow.documentflow.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.documentflow.documentflow.Entity.User;
import com.documentflow.documentflow.Service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        try {
            userService.RegisterUser(user);
        } catch (Exception e) {
            return "Username Already Exit";
        }

        return "User Saved Succesfully"; 
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUserByName(@PathVariable String username) throws Exception {
        return userService.getUserByUserName(username)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    
}
