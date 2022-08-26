package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepositoryImpl {

// Changing somethin in feature two  
    public String get() {
        return "Hello JUnit 5";
    }

}
