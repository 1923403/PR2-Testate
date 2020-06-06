package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AVLTreeNodeIsAVLTesting {

	@Test
	void isAVLTreeTestingTrueSimple() {
		var avlTreeNode1 = new AVLTreeNode<>(2, new AVLTreeNode<>(1), new AVLTreeNode<>(3));
		assertTrue(avlTreeNode1.isAVLTree());
	}

	@Test
	void isSearchTreeTestingOnlyLeftChilds() {
		var avlTreeNode1 = new AVLTreeNode<>(1,
				new AVLTreeNode<>(2, new AVLTreeNode<>(1, new AVLTreeNode<>(1), null), null), null);
		assertFalse(avlTreeNode1.isAVLTree());
	}

	@Test
	void isSearchTreeTestingRecursionRight() {
		var avlTreeNode1 = new AVLTreeNode<>(10, new AVLTreeNode<>(5, new AVLTreeNode<>(3), new AVLTreeNode<>(8)),
				new AVLTreeNode<>(15, new AVLTreeNode<>(3), new AVLTreeNode<>(8)));
		assertFalse(avlTreeNode1.isAVLTree());
	}

	@Test
	void isSearchTreeTestingRecursionIntricateFalse() {
		var avlTreeNode1 = new AVLTreeNode<>(100,
				new AVLTreeNode<>(50, null,
						new AVLTreeNode<>(60, new AVLTreeNode<>(55, null, new AVLTreeNode<>(56)), null)),
				new AVLTreeNode<>(150, null, new AVLTreeNode<>(160)));
		assertFalse(avlTreeNode1.isAVLTree());
	}

	@Test
	void isSearchTreeTestingRecursionIntricateTrue() {
		var avlTreeNode1 = new AVLTreeNode<>(100,
				new AVLTreeNode<>(50, null,
						new AVLTreeNode<>(60, new AVLTreeNode<>(55, null, new AVLTreeNode<>(56)), null)),
				new AVLTreeNode<>(150, null, new AVLTreeNode<>(160, new AVLTreeNode<>(155), null)));
		assertTrue(avlTreeNode1.isAVLTree());
	}

}
