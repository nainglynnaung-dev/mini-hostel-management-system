package com.ly.hostel.model;

import com.ly.hostel.data.Status;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "booking")
public class Booking {
	//id, user_id, room_id, start_date, end_date, status
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String startDate;
	private String endDate;
	
    @OneToOne
    @JoinColumn(name = "auth_user_id", referencedColumnName = "id")
	private AuthUser authuser;
    
    @ManyToOne
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;
    
    @Enumerated(EnumType.STRING)
    private Status status;
	
    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private Payment payment;

}
