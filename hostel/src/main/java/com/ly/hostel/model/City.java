package com.ly.hostel.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Table(name = "city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String region;
	
	@OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
	private List<Hostel> hostel;
	

}
