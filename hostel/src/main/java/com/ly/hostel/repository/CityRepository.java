package com.ly.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ly.hostel.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
