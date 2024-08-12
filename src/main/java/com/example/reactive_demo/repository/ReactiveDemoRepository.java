package com.example.reactive_demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.reactive_demo.entity.User;

@Repository
public interface ReactiveDemoRepository extends ReactiveCrudRepository<User, Integer>{
}
