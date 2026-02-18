package com.ly.hostel.repository;

import com.ly.hostel.data.Status;
import com.ly.hostel.model.AuthUser;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
	
	Optional<AuthUser> findByUsername(String username);

    @Query(value = "select * from users as a where a.role=:role and a.status='ACTIVE'",nativeQuery = true)
    Page<AuthUser> findAllByRole(String role, Pageable pageable);
}
