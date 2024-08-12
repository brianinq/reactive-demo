package com.example.reactive_demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@Table("users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column("user_id")
    private Integer userId;
    @Column("user_name")
    private String userName;
    @Column("first_name")
    private String firstName;
    @Column("email")
    private String email;
}
