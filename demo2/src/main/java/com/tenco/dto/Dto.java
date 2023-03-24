package com.tenco.dto;

public class Dto {
	private String name;
	private String password;
	
	public Dto(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public Dto() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Dto [name=" + name + ", password=" + password + "]";
	}
	
	
}
