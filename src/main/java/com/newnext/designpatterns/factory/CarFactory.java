package com.newnext.designpatterns.factory;

public class CarFactory implements VehicleFactoryManager {

	@Override
	public Vehicle create() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
