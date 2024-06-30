package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AuthenticationRequest;

@Repository
// UserRepository extends JpaRepository to provide CRUD operations for AuthenticationRequest entities
public interface UserRepository extends JpaRepository<AuthenticationRequest, Integer> {
    
    // Method to find an AuthenticationRequest entity by its username
    AuthenticationRequest findByUsername(String username);
    
    // Method to find a list of AuthenticationRequest entities by their role
    List<AuthenticationRequest> findByRole(AuthenticationRequest role);
}
