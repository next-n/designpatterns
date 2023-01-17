package com.newnext.designpatterns.iterator.ds;

public class BinaryTree implements DataStructures {
	private final Node node;

	public BinaryTree(Node node) {
		super();
		this.node = node;
	}

	@Override
	public <T> T expose() {
		// TODO Auto-generated method stub
		return (T) node;
	}
	
	

}
