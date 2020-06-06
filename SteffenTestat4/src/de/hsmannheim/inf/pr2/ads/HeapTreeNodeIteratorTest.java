package de.hsmannheim.inf.pr2.ads;

public class HeapTreeNodeIteratorTest {

	public static void main(String[] args) {
		var htn = new HeapTreeNode<>(10, new HeapTreeNode<>(5, new HeapTreeNode<>(3), new HeapTreeNode<>(8)),
				new HeapTreeNode<>(15, new HeapTreeNode<>(3), new HeapTreeNode<>(8)));

		for (var x : htn)
			System.out.println(x);
	}
}
