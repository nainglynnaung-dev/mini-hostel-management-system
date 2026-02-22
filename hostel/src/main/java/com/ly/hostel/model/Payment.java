package com.ly.hostel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "payment")
public class Payment {
// id, booking_id, amount, payment_date, method
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double amount;
	private String method;
	private String paymentDate;
	
	@OneToOne
	@JoinColumn(name = "booking_id", referencedColumnName = "id")
	private Booking booking;
	
	
}
