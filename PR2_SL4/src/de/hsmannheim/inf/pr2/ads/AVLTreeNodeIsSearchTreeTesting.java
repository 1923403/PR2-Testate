package de.hsmannheim.inf.pr2.ads;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AVLTreeNodeIsSearchTreeTesting {

	@Test
	void isSearchTreeTestingTrue() {
		var avlTreeNode1 = new AVLTreeNode<>(2, new AVLTreeNode<>(1), new AVLTreeNode<>(3));
		assertTrue(avlTreeNode1.isSearchTree());

	}

	@Test
	void isSearchTreeTestingFalse() {
		var avlTreeNode1 = new AVLTreeNode<>(7, new AVLTreeNode<>(9), new AVLTreeNode<>(3));
		assertFalse(avlTreeNode1.isSearchTree());

	}

	@Test
	void isSearchTreeTesting() {
		var avlTreeNode1 = new AVLTreeNode<>(1, new AVLTreeNode<>(6, new AVLTreeNode<>(7), new AVLTreeNode<>(8)),
				new AVLTreeNode<>(9, new AVLTreeNode<>(10), new AVLTreeNode<>(11)));
		assertFalse(avlTreeNode1.isSearchTree());
	}

	@Test
	void isSearchTreeTestingRekursionLinks() {
		var avlTreeNode1 = new AVLTreeNode<>(10, new AVLTreeNode<>(5, new AVLTreeNode<>(7), new AVLTreeNode<>(8)),
				new AVLTreeNode<>(15));
		assertFalse(avlTreeNode1.isSearchTree());
	}

	@Test
	void isSearchTreeTestingRekursionRechts() {
		var avlTreeNode1 = new AVLTreeNode<>(10, new AVLTreeNode<>(5, new AVLTreeNode<>(3), new AVLTreeNode<>(8)),
				new AVLTreeNode<>(15, new AVLTreeNode<>(3), new AVLTreeNode<>(8)));
		assertFalse(avlTreeNode1.isSearchTree());
	}
}
