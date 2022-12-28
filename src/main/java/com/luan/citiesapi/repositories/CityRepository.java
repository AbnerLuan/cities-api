package com.luan.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luan.citiesapi.domains.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
