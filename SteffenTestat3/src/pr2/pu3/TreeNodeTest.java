package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreeNodeTest {

	@Test
	void testEqualStructure() {
		var treeNode1 = new TreeNode<Integer>(null);
		var treeNode2 = new TreeNode<Integer>(null);
		var treeNode3 = new TreeNode<>(5, new TreeNode<>(1), null);
		var treeNode4 = new TreeNode<>(5, new TreeNode<>(1), new TreeNode<>(7));
		var treeNode5 = new TreeNode<>(5, new TreeNode<>(1), new TreeNode<>(6));
		var treeNode6 = new TreeNode<>(5, new TreeNode<>(7), new TreeNode<>(1));
		var treeNode7 = new TreeNode<>(5, new TreeNode<>(1), new TreeNode<>(7));

		assertTrue(treeNode1.equalStructure(treeNode2));
		assertFalse(treeNode3.equalStructure(treeNode1));
		
		// FEHLER!
		assertFalse(treeNode4.equalStructure(treeNode5));
		
		assertFalse(treeNode4.equalStructure(treeNode6));
		assertTrue(treeNode4.equalStructure(treeNode7));
	}

}
