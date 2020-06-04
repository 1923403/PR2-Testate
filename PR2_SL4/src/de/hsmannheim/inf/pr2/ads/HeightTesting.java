package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HeightTesting {
	@Test
	void testHeight2() {
		var avlTreeNode1 = new AVLTreeNode<>(2, new AVLTreeNode<>(1), new AVLTreeNode<>(3));
		assertTrue(avlTreeNode1.height() == 2);
	}
	@Test
	void testHeight3() {
		var avlTreeNode1 = new AVLTreeNode<>(1, new AVLTreeNode<>(6, new AVLTreeNode<>(7), new AVLTreeNode<>(8)),
				new AVLTreeNode<>(9, new AVLTreeNode<>(10), new AVLTreeNode<>(11)));
		assertTrue(avlTreeNode1.height() == 3);
	}
}
