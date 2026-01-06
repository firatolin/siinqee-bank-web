package com.siinqee.banking.repository;

import com.siinqee.banking.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminUser, Long> {
    
    Optional<AdminUser> findByUsernameAndPassword(String username, String password);
    
    Optional<AdminUser> findByUsername(String username);
    
    boolean existsByUsername(String username);
}