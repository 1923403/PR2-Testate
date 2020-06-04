package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class HeapTreeNode<E extends Comparable<E>> extends TreeNode<E> implements Iterable<E> {

	protected HeapTreeNode<E> left = null;
	protected HeapTreeNode<E> right = null;

	public HeapTreeNode(E v) {
		super(v);

	}

	public HeapTreeNode(E value, HeapTreeNode<E> left, HeapTreeNode<E> right) {
		super(value);
		this.left = left;
		this.right = right;
	}

	boolean isMinHeapTree() {
		if (this.left != null) {
			if (this.left.value.compareTo(this.value) < 0) {
				return false;
			}
			if (!this.left.isMinHeapTree()) {
				return false;
			}
		}
		if (this.right != null) {
			if (this.right.value.compareTo(this.value) < 0) {
				return false;
			}
			if (!this.right.isMinHeapTree()) {
				return false;
			}
		}

		return true;
	}

	boolean isMaxHeapTree() {
		if (this.left != null) {
			if (this.left.value.compareTo(this.value) > 0) {
				return false;
			}
			if (!this.left.isMaxHeapTree()) {
				return false;
			}
		}
		if (this.right != null) {
			if (this.right.value.compareTo(this.value) > 0) {
				return false;
			}
			if (!this.right.isMaxHeapTree()) {
				return false;
			}
		}

		return true;
	}
	/*
	 * // ArrayList<E> convertToArrayList() { int[] array() { int index = 1; // var
	 * arrayList = new ArrayList<E>(30); var arrayList = new int[10];
	 * 
	 * return convertToArrayListRecursion(index, arrayList);
	 * 
	 * }
	 * 
	 * // ArrayList<E> convertToArrayListRecursion(int index, ArrayList<E>
	 * arrayList) { int[] convertToArrayListRecursion(int index, int[] arrayList) {
	 * if (index == 1) // arrayList.add(index - 1, this.value); arrayList[index - 1]
	 * = (int) this.value;
	 * 
	 * System.out.println("startindex" + index); if (this.left != null) { int
	 * indexLeft = 2 * index; System.out.println("indexLeft" + indexLeft); //
	 * arrayList.add(indexLeft - 1, this.left.value); arrayList[indexLeft - 1] =
	 * (int) this.left.value; this.left.convertToArrayListRecursion(indexLeft,
	 * arrayList); } if (this.right != null) { int indexRight = 2 * index + 1;
	 * System.out.println("indexRight" + indexRight); // arrayList.add(indexRight -
	 * 1, this.right.value); arrayList[indexRight - 1] = (int) this.right.value;
	 * this.right.convertToArrayListRecursion(indexRight, arrayList);
	 * 
	 * } return arrayList; }
	 */
	/*
	 * 
	 * Strategie:
	 * 
	 * root in arraylist
	 * 
	 * 
	 * Rekursion Start
	 * 
	 * arraylist + leftchild arrayList + rightchild queue + leftchild queue +
	 * rightchild
	 * 
	 * Rekursion an head von queue
	 * 
	 * arraylist: 1 3 2 queue
	 * 
	 */

	//Strategie: Wir verwenden ArrayList als queue, mit Index 
	//gehen wir sie durch, fügen immer beide Kinder hinzu 
	//und rufen rekursiv am nächsten Index wieder auf
	ArrayList<HeapTreeNode<E>> array() {

		// Initialisierung
		var arrayList = new ArrayList<HeapTreeNode<E>>(0);
		arrayList.add(this);
		int index = 0;
		return arrayRecursion(arrayList, index);
	}

	ArrayList<HeapTreeNode<E>> arrayRecursion(ArrayList<HeapTreeNode<E>> arrayList, int index) {
	
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
