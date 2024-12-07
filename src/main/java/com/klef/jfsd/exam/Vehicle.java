package com.klef.jfsd.exam;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity

@Inheritance(strategy = InheritanceType.JOINED)

public class Vehicle
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pid")
	private int id;
	@Column(name = "pname", length = 50)
	private String name;
	@Column(name = "type", length = 20)
	private String type;
	@Column(name = "maxspeed")
	private double maxspeed;
	@Column(name = "color", length = 50)
	private String color;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(double maxspeed) {
		this.maxspeed = maxspeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	
}
