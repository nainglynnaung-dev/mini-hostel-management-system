package com.ly.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ly.hostel.model.Booking;

public interface BookingRepository  extends JpaRepository<Booking, Long>{

}
