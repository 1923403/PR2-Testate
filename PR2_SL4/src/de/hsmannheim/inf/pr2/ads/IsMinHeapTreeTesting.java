package de.hsmannheim.inf.pr2.ads;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class IsMinHeapTreeTesting {
	@Test
	void isMinHeapTreeTrue() {
		var heapTreeNode1 = new HeapTreeNode<>(2, new HeapTreeNode<>(7), new HeapTreeNode<>(3));
		assertTrue(heapTreeNode1.isMinHeapTree());

	}
	@Test
	void isMinHeapTreeFalse() {
		var heapTreeNode1 = new HeapTreeNode<>(9, new HeapTreeNode<>(7), new HeapTreeNode<>(3));
		assertFalse(heapTreeNode1.isMinHeapTree());

	}
	@Test
	void isMinHeapTreeTrue2() {
		var heapTreeNode1 = new HeapTreeNode<>(-10, new HeapTreeNode<>(7,new HeapTreeNode<>(7),new HeapTreeNode<>(10)), new HeapTreeNode<>(3));
		assertTrue(heapTreeNode1.isMinHeapTree());

	}
	@Test
	void isMinHeapTreeFalse2() {
		var heapTreeNode1 = new HeapTreeNode<>(-10, new HeapTreeNode<>(7,new HeapTreeNode<>(-17),new HeapTreeNode<>(10)), new HeapTreeNode<>(3));
		assertFalse(heapTreeNode1.isMinHeapTree());

	}
}
