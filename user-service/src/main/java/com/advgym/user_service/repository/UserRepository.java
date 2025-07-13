package com.advgym.user_service.repository;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
=======
>>>>>>> edfe6f5dfc1f4aba543942946d08a1bd83be5b2c
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.advgym.user_service.entity.User;
import com.advgym.user_service.entity.UserStatus;

public interface UserRepository extends JpaRepository<User, Long>{
<<<<<<< HEAD
	Optional<User> findByEmail(String email);
    
    boolean existsByEmail(String email);
    
    List<User> findByStatus(UserStatus status);
    
    Page<User> findByStatus(UserStatus status, Pageable pageable);
    
    @Query("SELECT u FROM User u WHERE u.firstName LIKE %:name% OR u.lastName LIKE %:name%")
    List<User> findByNameContaining(@Param("name") String name);
    
    @Query("SELECT u FROM User u WHERE u.email LIKE %:email%")
    List<User> findByEmailContaining(@Param("email") String email);
    
    @Query("SELECT COUNT(u) FROM User u WHERE u.status = :status")
    long countByStatus(@Param("status") UserStatus status);
    
=======

>>>>>>> edfe6f5dfc1f4aba543942946d08a1bd83be5b2c
}
