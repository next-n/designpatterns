package com.newnext.designpatterns.new1;

public class MainClassnew1 {

	public static void main(String[] args) {
		CarOne c1 = new CarOne("CarOne", "Good Brand", "Blue");
		CarDisplay carDisplay = new CarDisplay(c1);
		carDisplay.display();
		

	}

}
