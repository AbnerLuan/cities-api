package com.luan.citiesapi.ressources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luan.citiesapi.domains.State;
import com.luan.citiesapi.repositories.StateRepository;

@RestController
@RequestMapping("/states")
public class StateResource {

	@Autowired
	private StateRepository repository;

	@GetMapping
	public Page<State> states(Pageable page) {
		return repository.findAll(page);
	}

	@GetMapping("/{id}")
	public ResponseEntity<State> getOne(@PathVariable Long id) {
		Optional<State> optional = repository.findById(id);
		if (optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());
		} else {
			return ResponseEntity.notFound().build();
		}

	}

}