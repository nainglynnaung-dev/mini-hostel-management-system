package com.ly.hostel.repository;

import com.ly.hostel.model.AuthUser;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
	
	Optional<AuthUser> findByUsername(String username);
}
