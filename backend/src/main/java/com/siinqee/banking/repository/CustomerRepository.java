package com.siinqee.banking.repository;

import com.siinqee.banking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    Optional<Customer> findByPhone(String phone);
    
    Optional<Customer> findByAccount_AccountNumber(String accountNumber);
    
    boolean existsByPhone(String phone);
    
    boolean existsByAccount_AccountNumber(String accountNumber);
    
    @Query("SELECT COUNT(c) FROM Customer c")
    int getCustomerCount();
    
    @Query("SELECT SUM(a.balance) FROM Account a")
    Double getTotalBankBalance();
    
    @Query("SELECT c FROM Customer c WHERE c.firstName = :firstName AND c.password = :password")
    Optional<Customer> findByFirstNameAndPassword(@Param("firstName") String firstName, 
                                                  @Param("password") String password);
}