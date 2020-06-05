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
