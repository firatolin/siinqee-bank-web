package com.siinqee.banking.repository;

import com.siinqee.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    
    Optional<Account> findByAccountNumber(String accountNumber);
    
    boolean existsByAccountNumber(String accountNumber);
    
    @Modifying
    @Query("UPDATE Account a SET a.status = :status WHERE a.accountNumber = :accountNumber")
    void updateAccountStatus(@Param("accountNumber") String accountNumber, 
                            @Param("status") String status);
    
    @Query("SELECT a.status FROM Account a WHERE a.accountNumber = :accountNumber")
    String getAccountStatus(@Param("accountNumber") String accountNumber);
    
    @Modifying
    @Query("UPDATE Account a SET a.balance = :balance WHERE a.accountNumber = :accountNumber")
    void updateBalance(@Param("accountNumber") String accountNumber, 
                      @Param("balance") Double balance);
}