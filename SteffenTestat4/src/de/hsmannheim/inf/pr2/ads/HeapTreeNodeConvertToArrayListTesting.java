package de.hsmannheim.inf.pr2.ads;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HeapTreeNodeConvertToArrayListTesting {

	@Test
	void convert() {
		var heapTreeNode1 = new HeapTreeNode<>(2, new HeapTreeNode<>(1), new HeapTreeNode<>(3));
		assertEquals("[2 , 1 , 3 ]", heapTreeNode1.array().toString());
		
	}
	
	
	@Test
	void convert3() {
		var heapTreeNode1 = new HeapTreeNode<>(2, new HeapTreeNode<>(1,new HeapTreeNode<>(3),null), new HeapTreeNode<>(3));
//		assertEquals("[2, 1, 3]", heapTreeNode1.convertToArrayList().toString());
//		System.out.println(heapTreeNode1.convertToArrayList().toString());
		for(var a:heapTreeNode1.array())
			System.out.println(a);
	}

	@Test
	void convert2() {
		var heapTreeNode1 = new HeapTreeNode<>(10, new HeapTreeNode<>(5, new HeapTreeNode<>(3), new HeapTreeNode<>(8)),
				new HeapTreeNode<>(15, new HeapTreeNode<>(3), new HeapTreeNode<>(8)));

		assertEquals("[10 , 5 , 15 , 3 , 8 , 3 , 8 ]", heapTreeNode1.array().toString());
	}
	
	@Test
	void iterator() {
		var heapTreeNode1 = new HeapTreeNode<>(10, new HeapTreeNode<>(5, new HeapTreeNode<>(3), new HeapTreeNode<>(8)),
				new HeapTreeNode<>(15, new HeapTreeNode<>(3), new HeapTreeNode<>(8)));
		
		System.out.println(heapTreeNode1.array().toString());
	}

}
