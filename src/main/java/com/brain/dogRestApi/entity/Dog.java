package com.brain.dogRestApi.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Dog {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String Breed;
	private String Origin;
	
	public Dog(String name, String breed, String origin) {
		super();
		this.name = name;
		Breed = breed;
		Origin = origin;
	}

	public Dog(String name, String breed) {
		super();
		this.name = name;
		Breed = breed;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Dog() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return Breed;
	}

	public void setBreed(String breed) {
		Breed = breed;
	}

	public String getOrigin() {
		return Origin;
	}

	public void setOrigin(String origin) {
		Origin = origin;
	}
	
	
	
	

}
