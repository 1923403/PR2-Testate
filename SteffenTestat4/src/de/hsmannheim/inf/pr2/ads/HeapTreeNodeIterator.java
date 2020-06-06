package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Iterator;


public class HeapTreeNodeIterator<E extends HeapTreeNode<?>> implements Iterator<E> {

	ArrayList<?> arrayList;
	int index = 0;

	HeapTreeNodeIterator(E nodeToIterate) {
		arrayList = nodeToIterate.array();
	}

	@Override
	public boolean hasNext() {

		return (index < arrayList.size());
	}

	@Override
	public E next() {
		E result = arrayList.get(index++);
		
		return result;
	}

}
