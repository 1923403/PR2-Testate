package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Iterator;

public class HeapTreeNodeIterator implements Iterator<HeapTreeNode<? extends Comparable<?>>> {

	private ArrayList<HeapTreeNode<?>> arrayList;
	private int index = 0;

	public HeapTreeNodeIterator(ArrayList<HeapTreeNode<?>> arrayList) {
		this.arrayList = arrayList;
	}

	@Override
	public boolean hasNext() {
		return (index < arrayList.size());
	}

	@Override
	public HeapTreeNode<?> next() {
		var result = arrayList.get(index++);
		return result;
	}
}
