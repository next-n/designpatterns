package com.newnext.designpatterns.iterator.compiler;

import java.util.ArrayList;
import java.util.List;

import com.newnext.designpatterns.iterator.ds.ArrayDs;
import com.newnext.designpatterns.iterator.ds.DataStructures;

public class ArrayCompiler implements Compiler {
	private ArrayCompiler() {
		
	}
	private ArrayList<Integer> arraylist = new ArrayList<>();
	
	private static class SingletonHolder{
		private static final ArrayCompiler ac = new ArrayCompiler();
	}
	@Override
	public Boolean support(Class<?> ds) {
		// TODO Auto-generated method stub
		return ArrayDs.class.equals(ds);
	}

	@Override
	public void compile(DataStructures ds) {
		int[] temp = (int[])ds.expose();
		for(int t: temp) {
			this.arraylist.add(t);
		}
		// TODO Auto-generated method stub

	}
	
	
	public static ArrayCompiler getInstance() {
		return SingletonHolder.ac;
	}

	@Override
	public <T> T getArrayList() {
		// TODO Auto-generated method stub
		return (T) arraylist;
	}

}
