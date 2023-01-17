package com.newnext.designpatterns.iterator.ds;

public class NodeUtilsTest {
	private static final Node node = new Node(1, new Node(2, new Node(4, null, null), new Node(5, null, null)), 
			new Node(3, new Node(6, null, null), new Node(7, null, null)));
	public static Node getNode() {
		return node;
	}
}
