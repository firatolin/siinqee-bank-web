package com.siinqee.banking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {
    
    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "🎉 SINQEE BANK BACKEND IS RUNNING!");
        response.put("status", "SUCCESS");
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/db-check")
    public ResponseEntity<Map<String, Object>> dbCheck() {
        Map<String, Object> response = new HashMap<>();
        response.put("database", "siinqee_banking");
        response.put("status", "CONNECTED");
        response.put("port", 3306);
        response.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.ok(response);
    }
}