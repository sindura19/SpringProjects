package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="CORONA_VACCINE_TAB")
@AllArgsConstructor
@NoArgsConstructor
public class CoronaVaccine implements Serializable {
	@Id
	@Column(length =20)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long regNo;
	@Column(length =20)
	private String name;
	@Column(length =20)
	private String company;
	@Column(length =20)
	private String country;
	@Column(length =20)
	private Double price;
	@Column(length =20) 
	private Integer requiredDoseCount;
	
}
