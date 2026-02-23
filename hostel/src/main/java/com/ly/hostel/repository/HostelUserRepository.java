package com.ly.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ly.hostel.model.HostelOwner;

public interface HostelUserRepository extends JpaRepository<HostelOwner, Long>{

}
