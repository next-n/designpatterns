package com.newnext.designpatterns.iterator.compiler;

import java.util.ArrayList;
import java.util.List;

import com.newnext.designpatterns.iterator.ds.DataStructures;

public interface Compiler {
	public Boolean support(Class<?> ds);
	public void compile(DataStructures ds);
	public <T extends Object> T getArrayList();
	
}
