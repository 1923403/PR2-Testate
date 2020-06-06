package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Iterator;

public class HeapTreeNodeIterator<E extends Comparable<E>> implements Iterator<HeapTreeNode<E>> {

	private ArrayList<HeapTreeNode<E>> arrayList;
	private int index = 0;

	public HeapTreeNodeIterator(ArrayList<HeapTreeNode<E>> arrayList) {
		this.arrayList = arrayList;
	}

	@Override
	public boolean hasNext() {
		return (index < arrayList.size());
	}

	@Override
	public HeapTreeNode<E> next() {
		var result = arrayList.get(index++);
		return result;
	}
}
