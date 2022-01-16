package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.example.demo.model.Users;
@Component
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUserId(long id);
}