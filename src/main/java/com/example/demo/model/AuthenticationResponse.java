package com.example.demo.model;

//This class represents the response object for authentication requests
public class AuthenticationResponse {

 // Field to store the JWT token
 private final String jwt;

 // Constructor to initialize the jwt field
 public AuthenticationResponse(String jwt) {
     this.jwt = jwt;
 }

 // Getter method to access the jwt field
 public String getJwt() {
     return jwt;
 }
}
