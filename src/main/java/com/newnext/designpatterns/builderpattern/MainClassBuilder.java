package com.newnext.designpatterns.builderpattern;

public class MainClassBuilder {

	public static void main(String[] args) {
		Product p = new Product.Builder().name("name").brand("brand").build();
		Product p2 = Product.builder().build();
		// TODO Auto-generated method stub

	}

}
