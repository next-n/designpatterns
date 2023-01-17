package com.newnext.designpatterns.iterator.ds;

public class Node {
	private final Integer value;
	private final Node left;
	private final Node right;
	public Node(Integer value, Node left, Node right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public Integer getValue() {
		return value;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}
	

}
