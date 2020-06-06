package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This is a custom Iterator to iterate over elements of the type
 * HeapTreeNode<>.
 * 
 * @author Gruppe 25: Floris (1921233), Raphael (1926543), Steffen (1923403)
 *
 * @param <E> represents a data type which implements Comparable<>
 */
public class HeapTreeNodeIterator<E extends Comparable<E>> implements Iterator<HeapTreeNode<E>> {

	private ArrayList<HeapTreeNode<E>> arrayList;
	private int index = 0;

	/**
	 * Creates an instance of HeapTreeNodeIterator<>.
	 * 
	 * @param arrayList ArrayList which contains elements of the type HeapTreeNode<>
	 */
	public HeapTreeNodeIterator(ArrayList<HeapTreeNode<E>> arrayList) {
		this.arrayList = arrayList;
	}

	/**
	 * @return true if ArrayList<> contains next element
	 */
	@Override
	public boolean hasNext() {
		return (index < arrayList.size());
	}

	/**
	 * @return next element of ArrayList<>
	 */
	@Override
	public HeapTreeNode<E> next() {
		var result = arrayList.get(index++);
		return result;
	}
}
