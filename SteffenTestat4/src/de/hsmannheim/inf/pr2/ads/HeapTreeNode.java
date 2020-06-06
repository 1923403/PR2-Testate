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
public class HeapTreeNode<E extends Comparable<E>> extends TreeNode<E> implements Iterable<E> {

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

	// Strategie: Wir verwenden ArrayList als queue, mit Index
	// gehen wir sie durch, fügen immer beide Kinder hinzu
	// und rufen rekursiv am nächsten Index wieder auf
	/**
	 * 
	 * @return
	 */
	public ArrayList<HeapTreeNode<E>> array() {

		// Initialisierung
		var arrayList = new ArrayList<HeapTreeNode<E>>(0);
		arrayList.add(this);
		int index = 0;
		return arrayRecursion(arrayList, index);
	}

	private ArrayList<HeapTreeNode<E>> arrayRecursion(ArrayList<HeapTreeNode<E>> arrayList, int index) {

		// Abbruchbedingung
		if (this.left == null)
			return arrayList;

		arrayList.add(this.left);

		// Abbruchbedingung
		if (this.right == null)
			return arrayList;

		arrayList.add(this.right);

		return arrayList.get(++index).arrayRecursion(arrayList, index);

	}

	@Override
	public Iterator<E> iterator() {

		return new HeapTreeNodeIterator<E>(this);
	}

}
