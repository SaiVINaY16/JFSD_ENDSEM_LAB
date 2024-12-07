package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity

public class Truck extends Vehicle
{
	@Column(name = "loadcapacity", length = 50)
	private String loadcapacity;

	public String getLoadcapacity() {
		return loadcapacity;
	}

	public void setLoadcapacity(String loadcapacity) {
		this.loadcapacity = loadcapacity;
	}

	
	
	
}
