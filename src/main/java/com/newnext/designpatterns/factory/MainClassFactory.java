package com.newnext.designpatterns.factory;

public class MainClassFactory {
	public static void main(String[] args) {
		VehicleFactoryManager carFactory = VehicleFactoryManager.createFactory(VehicleType.CAR);
		Vehicle car = carFactory.create();
		VehicleFactoryManager motorbikeFactory = VehicleFactoryManager.createFactory(VehicleType.MOTORBIKE);
		Vehicle motorbike = motorbikeFactory.create();
		System.out.println(car.getClass());
		System.out.println(motorbike.getClass());
	}

}
