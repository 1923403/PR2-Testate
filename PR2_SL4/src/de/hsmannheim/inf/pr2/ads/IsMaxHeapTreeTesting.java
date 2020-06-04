package de.hsmannheim.inf.pr2.ads;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class IsMaxHeapTreeTesting {
	@Test
	void isMaxHeapTreeFalse() {
		var heapTreeNode1 = new HeapTreeNode<>(2, new HeapTreeNode<>(7), new HeapTreeNode<>(3));
		assertFalse(heapTreeNode1.isMaxHeapTree());

	}
	@Test
	void isMaxHeapTreeTrue() {
		var heapTreeNode1 = new HeapTreeNode<>(9, new HeapTreeNode<>(7), new HeapTreeNode<>(3));
		assertTrue(heapTreeNode1.isMaxHeapTree());

	}
	@Test
	void isMaxHeapTreeFalse2() {
		var heapTreeNode1 = new HeapTreeNode<>(-10, new HeapTreeNode<>(7,new HeapTreeNode<>(7),new HeapTreeNode<>(10)), new HeapTreeNode<>(3));
		assertFalse(heapTreeNode1.isMaxHeapTree());

	}
	@Test
	void isMaxHeapTreeTrue2() {
		var heapTreeNode1 = new HeapTreeNode<>(20, new HeapTreeNode<>(7,new HeapTreeNode<>(-17),new HeapTreeNode<>(5)), new HeapTreeNode<>(3));
		assertTrue(heapTreeNode1.isMaxHeapTree());

	}
}
