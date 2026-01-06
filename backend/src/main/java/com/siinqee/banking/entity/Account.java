package com.siinqee.banking.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long id;
    
    @Column(name = "account_number", unique = true, nullable = false, length = 20)
    private String accountNumber;
    
    @Column(name = "balance", precision = 15, scale = 2)
    @Builder.Default
    private Double balance = 0.0;
    
    @Column(name = "account_type", length = 50)
    private String accountType;
    
    @Column(name = "status", length = 20)
    @Builder.Default
    private String status = "Active";
    
    @Column(name = "opening_date")
    private LocalDate openingDate;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", unique = true)
    private Customer customer;
    
    @PrePersist
    protected void onCreate() {
        if (openingDate == null) {
            openingDate = LocalDate.now();
        }
        if (balance == null) {
            balance = 0.0;
        }
        if (status == null) {
            status = "Active";
        }
    }
}