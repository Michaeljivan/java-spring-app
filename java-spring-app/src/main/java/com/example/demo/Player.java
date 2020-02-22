package com.example.demo;

public class Player {
	private String name;
	private String position;
	private String country;
		
	
	public Player(String name, String position, String country) {
		super();
		this.name = name;
		this.position = position;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
