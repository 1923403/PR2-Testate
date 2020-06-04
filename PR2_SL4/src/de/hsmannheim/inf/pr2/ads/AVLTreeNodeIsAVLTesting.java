package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AVLTreeNodeIsAVLTesting {
	

		@Test
		void isAVLTreeTestingTrue() {
			var avlTreeNode1 = new AVLTreeNode<>(2, new AVLTreeNode<>(1), new AVLTreeNode<>(3));
			assertTrue(avlTreeNode1.isAVLTree());

		}

		

		@Test
		void isSearchTreeTestingOnlyLeftChilds() {
			var avlTreeNode1 = new AVLTreeNode<>(1, new AVLTreeNode<>(2,new AVLTreeNode<>(1,new AVLTreeNode<>(1),null),null),null);
			assertFalse(avlTreeNode1.isAVLTree());
		}

//		@Test
//		void isSearchTreeTestingRekursionLinks() {
//			var avlTreeNode1 = new AVLTreeNode<>(10, new AVLTreeNode<>(5, new AVLTreeNode<>(7), new AVLTreeNode<>(8)),
//					new AVLTreeNode<>(15));
//			assertFalse(avlTreeNode1.isSearchTree());
//		}
//
		@Test
		void isSearchTreeTestingRekursionRechts() {
			var avlTreeNode1 = new AVLTreeNode<>(10, new AVLTreeNode<>(5, new AVLTreeNode<>(3), new AVLTreeNode<>(8)),
					new AVLTreeNode<>(15, new AVLTreeNode<>(3), new AVLTreeNode<>(8)));
			assertFalse(avlTreeNode1.isSearchTree());
		}
	}


