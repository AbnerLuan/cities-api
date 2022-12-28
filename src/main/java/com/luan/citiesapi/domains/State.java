package com.luan.citiesapi.domains;

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado")
public class State {

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	private String uf;

	private Integer ibge;

	@ManyToOne
	@JoinColumn(name = "pais", referencedColumnName = "id")
	private Country country;

	@JdbcTypeCode(SqlTypes.JSON)
	private List<Integer> ddd;

	public State() {
		super();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUf() {
		return uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public List<Integer> getDdd() {
		return ddd;
	}

	public Country getCountry() {
		return country;
	}

}
