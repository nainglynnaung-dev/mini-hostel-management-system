package com.ly.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ly.hostel.model.Hostel;


public interface HostelRepository extends JpaRepository<Hostel, Long> {

}
