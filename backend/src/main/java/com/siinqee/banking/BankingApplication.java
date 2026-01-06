package com.siinqee.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankingApplication.class, args);
        System.out.println("========================================");
        System.out.println("✅ SINQEE BANKING SYSTEM STARTED");
        System.out.println("✅ Port: 8080");
        System.out.println("✅ Database: siinqee_banking");
        System.out.println("========================================");
    }
}