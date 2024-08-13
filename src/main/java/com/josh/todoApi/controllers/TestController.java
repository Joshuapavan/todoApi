package com.josh.todoApi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/tests")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {
    
    @SuppressWarnings("rawtypes")
    @GetMapping
    public ResponseEntity getHttpResponse(){
        return ResponseEntity.ok("Hello, World!");
    }

}
