package com.luan.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luan.citiesapi.domains.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
