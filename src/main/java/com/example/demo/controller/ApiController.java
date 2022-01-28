package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.dto.UserReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //Rest API 처리하는 Controller(JSON)
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user;
    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {

       return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping
    public UserReq user(UserReq userReq) {
        return userReq;
    }
}
