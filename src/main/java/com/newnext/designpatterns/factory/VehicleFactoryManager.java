
package com.newnext.designpatterns.factory;

public interface VehicleFactoryManager {
	public Vehicle create();
	
	static VehicleFactoryManager createFactory(VehicleType type) {
		switch (type) {
		case CAR: return new CarFactory();
		case MOTORBIKE: return new MotorbikeFactory();
		}
		throw new IllegalArgumentException();	
	}

}
