package com.siinqee.banking.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long id;
    
    @Column(name = "account_number", length = 20)
    private String accountNumber;
    
    @Column(name = "transaction_type", length = 20)
    private String type;
    
    @Column(name = "description", length = 255)
    private String description;
    
    @Column(name = "amount", precision = 15, scale = 2)
    private Double amount;
    
    @Column(name = "recipient_account", length = 20)
    private String recipientAccount;
    
    @Column(name = "transaction_date")
    private LocalDateTime timestamp;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @PrePersist
    protected void onCreate() {
        if (timestamp == null) {
            timestamp = LocalDateTime.now();
        }
    }
    
    public String getFormattedAmount() {
        if (amount >= 0) {
            return "+ETB " + String.format("%.2f", amount);
        } else {
            return "-ETB " + String.format("%.2f", Math.abs(amount));
        }
    }
    
    public String getFormattedTimestamp() {
        return timestamp.toString();
    }
}