package com.example.reactive_demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactive_demo.dto.UserRequest;
import com.example.reactive_demo.entity.User;
import com.example.reactive_demo.service.ReactiveDemoService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ReactiveDemoController {
    private final ReactiveDemoService reactiveDemoService;
    
    @GetMapping("/hello")
    public String getMethodName() {
        return new String("hello world");
    }
    
    @PostMapping("users")
    public Mono<User> createUser(@RequestBody UserRequest newUser){
        return reactiveDemoService.createUser(newUser);
    }

    @GetMapping("users")
    public Flux<User> getAllUsers() {
        return reactiveDemoService.getAllUsers();
    }
    
}
