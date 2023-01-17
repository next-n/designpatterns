package com.newnext.designpatterns.iterator;

import java.util.ArrayList;

import com.newnext.designpatterns.iterator.compiler.ArrayCompiler;
import com.newnext.designpatterns.iterator.compiler.BfsCompiler;
import com.newnext.designpatterns.iterator.compiler.DfsInOrderCompiler;
import com.newnext.designpatterns.iterator.ds.DataStructures;

public class Container implements Iterator {
	private int cursor = -1;
	private ArrayList<Integer> iterateList;
	
	/**
	 * Compilers
	 */
	private ArrayCompiler arrayCompiler = ArrayCompiler.getInstance();
	private DfsInOrderCompiler dfsInOrderCompiler = DfsInOrderCompiler.getInstance();
	private BfsCompiler bfsCompiler = BfsCompiler.getInstance();
	@Override
	public void compile(DataStructures ds) {
		if(arrayCompiler.support(ds.getClass())) {
			arrayCompiler.compile(ds);
			this.iterateList = arrayCompiler.getArrayList();
		}
		else if(dfsInOrderCompiler.support(ds.getClass())) {
			dfsInOrderCompiler.compile(ds);
			this.iterateList = dfsInOrderCompiler.getArrayList();
		}
		else if(bfsCompiler.support(ds.getClass())) {
			bfsCompiler.compile(ds);
			this.iterateList = bfsCompiler.getArrayList();
		}
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean hasNext() {
		// TODO Auto-generated method stub
		return cursor < this.iterateList.size()-1;
	}

	@Override
	public Boolean hasPrevious() {
		// TODO Auto-generated method stub
		return cursor > 0;
	}

	@Override
	public Integer next() {
		if (hasNext()) {
			cursor++;
			return this.iterateList.get(cursor);
		}
		return null;
	}

	@Override
	public Integer previous() {
		if(hasPrevious()) {
			cursor--;
			return this.iterateList.get(cursor);
		}
		return null;
	}

}
