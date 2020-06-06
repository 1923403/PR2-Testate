package de.hsmannheim.inf.pr2.ads;

/**
 * AUFGABE 2<br>
 * <br>
 * This class represents a node of an AVL tree.
 * 
 * @author Gruppe 25: Floris (1921233), Raphael (1926543), Steffen (1923403)
 *
 * @param <E> represents a data type which implements Comparable<>
 */
public class AVLTreeNode<E extends Comparable<E>> extends TreeNode<E> {

	protected AVLTreeNode<E> left = null;
	protected AVLTreeNode<E> right = null;

	/**
	 * Creates an instance of AVLTreeNode<>.
	 * 
	 * @param value this node's value of the type TreeNode<>
	 */
	public AVLTreeNode(E value) {
		super(value);
	}

	/**
	 * Creates an instance of AVLTreeNode<>.
	 * 
	 * @param value this node's value of the type TreeNode<>
	 * @param left  this node's left child value of the type AVLTreeNode<>
	 * @param right this node's right child value of the type AVLTreeNode<>
	 */
	public AVLTreeNode(E value, AVLTreeNode<E> left, AVLTreeNode<E> right) {
		super(value);
		this.left = left;
		this.right = right;
	}

	/**
	 * Checks if this tree is a search tree.
	 * 
	 * @return true if this tree is a search tree
	 */
	public boolean isSearchTree() {
		// return false if left child > this node's value
		if (this.left != null && this.value.compareTo(this.left.value) < 0)
			return false;

		// return false if right child < this node's value
		else if (this.right != null && this.value.compareTo(this.right.value) > 0)
			return false;

		// return false if a number of the left subtree is > this node's value
		if (this.left != null && !this.left.checkLeftSubtree(this.value))
			return false;

		// return false if a number of the right subtree is < this node's value
		if (this.right != null && !this.right.checkRightSubtree(this.value))
			return false;

		// recursion left child
		if (this.left != null)
			if (!this.left.isSearchTree())
				return false;

		// recursion right child
		if (this.right != null)
			if (!this.right.isSearchTree())
				return false;

		// tree is a search tree
		return true;
	}

	/**
	 * Checks if a number of the left subtree of this node is bigger than this
	 * node's value.
	 * 
	 * @param value this node's value of the type TreeNode<>
	 * 
	 * @return true if there is no bigger number than this node's value
	 */
	private boolean checkLeftSubtree(E value) {
		// return false if value of left child > this node's value
		if (this.left != null)
			if (this.left.value.compareTo(value) > 0)
				return false;

		// return false if value of right child > this node's value
		if (this.right != null)
			if (this.right.value.compareTo(value) > 0)
				return false;

		// recursion left child
		if (this.left != null)
			if (!this.left.checkLeftSubtree(value))
				return false;

		// recursion right child
		if (this.right != null)
			if (!this.right.checkLeftSubtree(value))
				return false;

		return true;
	}

	/**
	 * Checks if a number of the right subtree of this node is bigger than this
	 * node's value.
	 * 
	 * @param value this node's value of the type TreeNode<>
	 * 
	 * @return true if there is no bigger number than this node's value
	 */
	private boolean checkRightSubtree(E value) {
		// return false if value of left child < this node's value
		if (this.left != null)
			if (this.left.value.compareTo(value) < 0)
				return false;

		// return false if value of right child < this node's value
		if (this.right != null)
			if (this.right.value.compareTo(value) < 0)
				return false;

		// recursion left child
		if (this.left != null)
			if (!this.left.checkRightSubtree(value))
				return false;

		// recursion right child
		if (this.right != null)
			if (!this.right.checkRightSubtree(value))
				return false;

		return true;
	}

	// AUFGABE 3

	/**
	 * Checks if this tree is an AVL tree.
	 * 
	 * @return true if this tree is an AVL tree.
	 */
	public boolean isAVLTree() {
		// return false if this tree is not a search tree
		if (!this.isSearchTree())
			return false;

		// return false if height from left and right subtree differs more than 1
		if (this.left != null && this.right != null && Math.abs((this.left.avlHeight() - this.right.avlHeight())) > 1)
			return false;

		// recursion left child
		if (this.left != null)
			if (!this.left.isAVLTree())
				return false;

		// recursion right child
		if (this.right != null)
			if (!this.right.isAVLTree())
				return false;

		return true;
	}

	/**
	 * Determines height of a subtree.
	 * 
	 * @return height of a subtree
	 */
	private int avlHeight() {
		var leftHeight = 0;
		var rightHeight = 0;

		// determine height of left subtree recursively
		if (this.left != null)
			leftHeight = this.left.avlHeight();

		// determine height of right subtree recursively
		if (this.right != null)
			rightHeight = this.right.avlHeight();

		// return height
		if (leftHeight > rightHeight)
			return (leftHeight + 1);
		else
			return (rightHeight + 1);
	}
}
