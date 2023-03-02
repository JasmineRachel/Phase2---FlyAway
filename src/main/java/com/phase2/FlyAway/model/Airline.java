package com.phase2.FlyAway.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    //too be used in other entities
    public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}


    
}
