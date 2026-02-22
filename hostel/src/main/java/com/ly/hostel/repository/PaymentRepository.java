package com.ly.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ly.hostel.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
