package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * AUFGABE 4<br>
 * <br>
 * This class represents a node of a heap tree.
 * 
 * @author Gruppe 25: Floris (1921233), Raphael (1926543), Steffen (1923403)
 *
 * @param <E> represents a data type which implements Comparable<>
 */
public class HeapTreeNode<E extends Comparable<E>> extends TreeNode<E> implements Iterable<HeapTreeNode<E>> {

	protected HeapTreeNode<E> left;
	protected HeapTreeNode<E> right;

	/**
	 * Creates an instance of HeapTreeNode<>.
	 * 
	 * @param value this node's value of the type TreeNode<>
	 */
	public HeapTreeNode(E value) {
		super(value);
	}

	/**
	 * Creates an instance of HeapTreeNode<>.
	 * 
	 * @param value this node's value of the type TreeNode<>
	 * @param left  this node's left child value of the type HeapTreeNode<>
	 * @param right this node's right child value of the type HeapTreeNode<>
	 */
	public HeapTreeNode(E value, HeapTreeNode<E> left, HeapTreeNode<E> right) {
		super(value);
		this.left = left;
		this.right = right;
	}

	/**
	 * Checks if tree is a minimum heap tree.
	 * 
	 * @return true if tree is a minimum heap tree
	 */
	public boolean isMinHeapTree() {
		if (this.left != null) {
			// return false if value of left child < this node's value
			if (this.left.value.compareTo(this.value) < 0)
				return false;

			// recursion left child
			if (!this.left.isMinHeapTree())
				return false;
		}

		if (this.right != null) {
			// return false if value of right child < this node's value
			if (this.right.value.compareTo(this.value) < 0)
				return false;

			// recursion right child
			if (!this.right.isMinHeapTree())
				return false;
		}

		return true;
	}

	/**
	 * Checks if tree is a maximum heap tree.
	 * 
	 * @return true if tree is a maximum heap tree
	 */
	public boolean isMaxHeapTree() {
		if (this.left != null) {
			// return false if value of left child > this node's value
			if (this.left.value.compareTo(this.value) > 0)
				return false;

			// recursion left child
			if (!this.left.isMaxHeapTree())
				return false;
		}

		if (this.right != null) {
			// return false if value of right child > this node's value
			if (this.right.value.compareTo(this.value) > 0)
				return false;

			// recursion right child
			if (!this.right.isMaxHeapTree())
				return false;
		}

		return true;
	}

	/**
	 * AUFGABE 5<br>
	 * <br>
	 * Creates an ArrayList<> of this tree's values.
	 * 
	 * @return an ArrayList<> of heap tree values
	 */
	public ArrayList<HeapTreeNode<E>> array() {
		var arrayList = new ArrayList<HeapTreeNode<E>>(0);
		var index = 0;
		arrayList.add(this);
		return arrayRecursion(arrayList, index);
	}

	/**
	 * Creates array()'s ArrayList<> recursively.
	 * 
	 * @param arrayList
	 * @param index     of the element which child nodes have to be added to the
	 *                  ArrayList<>
	 * 
	 * @return an ArrayList<> of heap tree values
	 */
	private ArrayList<HeapTreeNode<E>> arrayRecursion(ArrayList<HeapTreeNode<E>> arrayList, int index) {
		// return ArrayList<> if there is no left child node
		if (this.left == null)
			return arrayList;

		arrayList.add(this.left);

		// return ArrayList<> if there is no right child node
		if (this.right == null)
			return arrayList;

		arrayList.add(this.right);

		return arrayList.get(++index).arrayRecursion(arrayList, index);
	}

	@Override
	public Iterator<HeapTreeNode<E>> iterator() {
		return new HeapTreeNodeIterator<E>(this.array());
	}
}
