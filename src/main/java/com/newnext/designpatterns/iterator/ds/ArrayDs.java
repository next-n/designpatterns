package com.newnext.designpatterns.iterator.ds;

public class ArrayDs implements DataStructures {
	private final int[] values;

	public ArrayDs(int[] values) {
		super();
		this.values = values;
	}

	@Override
	public <T> T expose() {
		// TODO Auto-generated method stub
		return (T)values;
	}

	

	

}
