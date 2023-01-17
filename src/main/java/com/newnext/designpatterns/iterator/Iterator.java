package com.newnext.designpatterns.iterator;

import com.newnext.designpatterns.iterator.ds.DataStructures;

public interface Iterator {
	void compile(DataStructures ds);

	Boolean hasNext();
	Boolean hasPrevious();
	Integer next();
	Integer previous();

}
