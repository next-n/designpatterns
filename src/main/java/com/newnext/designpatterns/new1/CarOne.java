package com.newnext.designpatterns.new1;

public class CarOne extends CarAbstractClass {
	private String name;
	private String brand;
	private String color;
	
	public CarOne(String name, String brand, String color) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}


	
}
