package com.example.reactive_demo.service;

import org.springframework.stereotype.Service;

import com.example.reactive_demo.dto.UserRequest;
import com.example.reactive_demo.entity.User;
import com.example.reactive_demo.repository.ReactiveDemoRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class ReactiveDemoServiceImpl implements ReactiveDemoService{
    private final ReactiveDemoRepository reactiveDemoRepository;

    @Override
    public Mono<User> createUser(UserRequest user) {
        User entity = User.builder()
                        .userName(user.getUserName())
                        .firstName(user.getFirstName())
                        .email(user.getEmail())
                        .build();
        return reactiveDemoRepository.save(entity);
    }

    @Override
    public Flux<User> getAllUsers() {
        return reactiveDemoRepository.findAll();
    }
    
}
