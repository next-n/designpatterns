package com.newnext.designpatterns.iterator.compiler;

import java.util.ArrayList;

import com.newnext.designpatterns.iterator.ds.BinaryTree;
import com.newnext.designpatterns.iterator.ds.DataStructures;
import com.newnext.designpatterns.iterator.ds.DfsInorderBinaryTree;
import com.newnext.designpatterns.iterator.ds.Node;

public class DfsInOrderCompiler implements Compiler {
	

	private ArrayList<Integer> arraylist = new ArrayList<>();
	public static class SingletonHolder{
		private static final DfsInOrderCompiler singleton = new DfsInOrderCompiler();
	}
	@Override
	public Boolean support(Class<?> ds) {
		// TODO Auto-generated method stub
		return DfsInorderBinaryTree.class.equals(ds);
	}

	@Override
	public void compile(DataStructures ds) {
		Node node = ds.expose();
		compileNode(node);
		
//		while(node!=null) {
//			this.arraylist.add(node.getValue());
//		}
	}
	private int compileNode(Node node) {
		if(node == null) {
			return 0;
		}
		compileNode(node.getLeft());
		this.arraylist.add(node.getValue());
		compileNode(node.getRight());
		return 1;
	}

	@Override
	public <T> T getArrayList() {
		// TODO Auto-generated method stub
		return (T)arraylist;
	}
	public static DfsInOrderCompiler getInstance() {
		return SingletonHolder.singleton;
	}

}
