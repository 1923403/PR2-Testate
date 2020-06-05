package de.hsmannheim.inf.pr2.ads;

public class AVLTreeNode<E extends Comparable<E>> extends TreeNode<E> {
	protected AVLTreeNode<E> left = null;
	protected AVLTreeNode<E> right = null;

	public AVLTreeNode(E v) {
		super(v);
	}

	public AVLTreeNode(E value, AVLTreeNode<E> left, AVLTreeNode<E> right) {
		super(value);
		this.left = left;
		this.right = right;
	}

	/**
	 * Aufgabe 2
	 * 
	 * @return true wenn es ein Suchbaum ist.
	 * @brief Untersucht auf Suchbaumeigenschaft.
	 */
	boolean isSearchTree() {
		// return false wenn linkes Kind>eigener value
		if (this.left != null && this.value.compareTo(this.left.value) < 0)
			return false;

		// return false wenn rechtes Kind<eigener value
		else if (this.right != null && this.value.compareTo(this.right.value) > 0)
			return false;

		// rekursion links
		if (this.left != null) {
			if (!this.left.isSearchTree())
				return false;
		}
		// rekursion rechts
		if (this.right != null) {
			if (!this.right.isSearchTree())
				return false;
		}
		// kein Fehler gefunden!
		return true;
	}

	public boolean isAVLTree() {
		if (!this.isSearchTree())
			return false;

		if (this.left != null && this.right != null && Math.abs((this.left.height() - this.right.height())) > 1) {
			return false;
		}
		// rekursion links
		if (this.left != null) {
			if (!this.left.isAVLTree())
				return false;
		}
		// rekursion rechts
		if (this.right != null) {
			if (!this.right.isAVLTree())
				return false;
		}
		return true;
	}

	public int height() {
		int leftHeight = 0, rightHeight = 0;
		if (this.left != null) {
			leftHeight = this.left.height();
		}
		if (this.right != null) {
			rightHeight = this.right.height();
		}

		if (leftHeight > rightHeight) {
			return (leftHeight + 1);
		} else {
			return (rightHeight + 1);
		}

	}

}
