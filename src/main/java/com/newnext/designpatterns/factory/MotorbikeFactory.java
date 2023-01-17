package com.newnext.designpatterns.factory;

public class MotorbikeFactory implements VehicleFactoryManager{

	@Override
	public Vehicle create() {
		return new Motorbike();
		
	}

}
