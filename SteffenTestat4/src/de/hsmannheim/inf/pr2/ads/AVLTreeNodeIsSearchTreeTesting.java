package de.hsmannheim.inf.pr2.ads;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AVLTreeNodeIsSearchTreeTesting {

	@Test
	void isSearchTreeTestingTrueSimple() {
		var avlTreeNode1 = new AVLTreeNode<>(2, new AVLTreeNode<>(1), new AVLTreeNode<>(3));
		assertTrue(avlTreeNode1.isSearchTree());
	}

	@Test
	void isSearchTreeTestingFalseSimple() {
		var avlTreeNode1 = new AVLTreeNode<>(7, new AVLTreeNode<>(9), new AVLTreeNode<>(3));
		assertFalse(avlTreeNode1.isSearchTree());
	}

	
	@Test
	void isSearchTreeTestingRekursionLinksFalse() {
		var avlTreeNode1 = new AVLTreeNode<>(10, new AVLTreeNode<>(5, new AVLTreeNode<>(7), new AVLTreeNode<>(8)),
				new AVLTreeNode<>(15));
		assertFalse(avlTreeNode1.isSearchTree());
	}

	@Test
	void isSearchTreeTestingRekursionLinksTrue() {
		var avlTreeNode1 = new AVLTreeNode<>(10, new AVLTreeNode<>(5, new AVLTreeNode<>(5), new AVLTreeNode<>(8)),
				new AVLTreeNode<>(15));
		assertTrue(avlTreeNode1.isSearchTree());
	}

	@Test
	void isSearchTreeTestingRekursionRechtsTrue() {
		var avlTreeNode1 = new AVLTreeNode<>(10, new AVLTreeNode<>(5, new AVLTreeNode<>(3), new AVLTreeNode<>(8)),
				new AVLTreeNode<>(15, new AVLTreeNode<>(13), new AVLTreeNode<>(17)));
		assertTrue(avlTreeNode1.isSearchTree());
	}
}
