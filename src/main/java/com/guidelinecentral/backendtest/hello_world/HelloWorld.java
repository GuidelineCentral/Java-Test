package com.guidelinecentral.backendtest.hello_world;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @GetMapping(path = "/hello_world", produces = "application/json")
    public ResponseEntity<Object> testAws() {
        return ResponseEntity.ok().body("Hello, World!");
    }
}
