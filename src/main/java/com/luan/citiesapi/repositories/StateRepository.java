package com.luan.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luan.citiesapi.domains.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
