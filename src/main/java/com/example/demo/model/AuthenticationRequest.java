package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Mark this class as a JPA entity
@Entity
public class AuthenticationRequest {

    // Define the primary key for this entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID value
    private int u_id; // User ID

    private String username; // Username field
    private String password; // Password field
    private String role; // Role field

    // Parameterized constructor
    public AuthenticationRequest(int u_id, String username, String password, String role) {
        super();
        this.u_id = u_id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getter and setter methods for each field

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Default constructor
    public AuthenticationRequest() {
        super();
        // This constructor is required by JPA
    }
}
