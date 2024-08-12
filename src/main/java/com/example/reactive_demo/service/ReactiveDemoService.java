package com.example.reactive_demo.service;


import com.example.reactive_demo.dto.UserRequest;
import com.example.reactive_demo.entity.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactiveDemoService {
    Mono<User> createUser(UserRequest user); 
    Flux<User> getAllUsers();   
} 
