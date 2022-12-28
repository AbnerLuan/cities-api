package com.luan.citiesapi.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cidade")
public class City {

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	private Integer uf;

	private Integer ibge;

	@Column(name = "lat_lon")
	private String geolocation;

	public City() {
		super();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getUf() {
		return uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public String getGeolocation() {
		return geolocation;
	}

}
