package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity

public class Car extends Vehicle
{
	@Column(name = "noofdoors", length = 50)
	private String noofdoors;

	public String getNoofdoors() {
		return noofdoors;
	}

	public void setNoofdoors(String noofdoors) {
		this.noofdoors = noofdoors;
	}

	
	
	
	
	
}
