package com.ly.hostel.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "room")
public class Room {

	// id, room_number, capacity, price, hostel_id
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int capacity;
	private int price;
	
	@ManyToOne
	@JoinColumn(name = "hostel_id", referencedColumnName = "id")
	private Hostel hostel;
	
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<Booking> booking;
	

}
