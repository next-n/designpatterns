package com.newnext.designpatterns.iterator.compiler;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

import com.newnext.designpatterns.iterator.ds.BfsBinaryTree;
import com.newnext.designpatterns.iterator.ds.DataStructures;
import com.newnext.designpatterns.iterator.ds.Node;

public class BfsCompiler implements Compiler{
	private BfsCompiler() {
		
	}
	private static class SingletonHolder{
		private static final BfsCompiler singleton = new BfsCompiler();
	}
	
	private ArrayList<Integer> arraylist = new ArrayList<>();

	@Override
	public Boolean support(Class<?> ds) {
		// TODO Auto-generated method stub
		return BfsBinaryTree.class.equals(ds);
	}

	@Override
	public void compile(DataStructures ds) {
		Node node = ds.expose();
		compileNode(node);
		
	}
	private void compileNode(Node node) {
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(node);
		while(queue.peek()!=null) {
			Node n = queue.poll();
			this.arraylist.add(n.getValue());
			if(n.getLeft()!=null) {
				queue.add(n.getLeft());
			}
			if(n.getRight()!=null) {
				queue.add(n.getRight());
			}
			
		}
		
	}

	@Override
	public <T> T getArrayList() {
		// TODO Auto-generated method stub
		return (T)arraylist;
	}
	public static BfsCompiler getInstance() {
		return SingletonHolder.singleton;
	}

}
