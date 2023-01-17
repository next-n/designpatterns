package com.newnext.designpatterns.iterator;

import java.util.ArrayList;

import com.newnext.designpatterns.iterator.ds.ArrayDs;
import com.newnext.designpatterns.iterator.ds.BfsBinaryTree;
import com.newnext.designpatterns.iterator.ds.BinaryTree;
import com.newnext.designpatterns.iterator.ds.DfsInorderBinaryTree;
import com.newnext.designpatterns.iterator.ds.Node;
import com.newnext.designpatterns.iterator.ds.NodeUtilsTest;

public class MainClassIterator {
	public static void main(String[] args) {
		int[] values = new int[] {1, 2, 3, 4, 5};
		ArrayDs arrayds = new ArrayDs(values);
		
		Node node = NodeUtilsTest.getNode();
		DfsInorderBinaryTree dfsInorderBinaryTree = new DfsInorderBinaryTree(node);
		BfsBinaryTree bfsBinaryTree = new BfsBinaryTree(node);
		Container c = new Container();
		c.compile(bfsBinaryTree);
		while(c.hasNext()) {
			System.out.println(c.next());
		}
	}
	
	
	

}
