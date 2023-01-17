package com.newnext.designpatterns.new1;

public class CarDisplay {
	private final CarAbstractClass carAbstractClass;
	
	public CarDisplay(CarAbstractClass carAbstractClass) {
		super();
		this.carAbstractClass = carAbstractClass;
	}

	public void display() {
		System.out.printf("Display Car named as %s and brand - %s its color is %s", carAbstractClass.getName(), carAbstractClass.getBrand(), carAbstractClass.getColor());
		
	}

}
