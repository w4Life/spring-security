package com.example.springsecurity.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springsecurity.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
    @Query("""
        select u from User u where u.username = :username
    """)
    Optional<User> findByUsername(@Param("username") String username);
}
