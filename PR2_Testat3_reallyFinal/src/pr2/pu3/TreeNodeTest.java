package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TreeNode-Tests")
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
		var treeNode8 = new TreeNode<>(5, new TreeNode<>(1), new TreeNode<>(7, new TreeNode<>(4), new TreeNode<>(5)));
		var treeNode9 = new TreeNode<>(5, new TreeNode<>(6, new TreeNode<>(7), new TreeNode<>(8)),
				new TreeNode<>(9, new TreeNode<>(10), new TreeNode<>(11)));
		var treeNode10 = new TreeNode<>(5, new TreeNode<>(6, new TreeNode<>(7), new TreeNode<>(8)),
				new TreeNode<>(9, new TreeNode<>(10), new TreeNode<>(11)));
		var treeNode11 = new TreeNode<>(5, new TreeNode<>(7, new TreeNode<>(5), new TreeNode<>(5)), new TreeNode<>(1));
		var treeNode12 = new TreeNode<>(5, new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3)), new TreeNode<>(7));

		// null - null
		assertTrue(treeNode1.equalStructure(treeNode2));
		assertTrue(treeNode2.equalStructure(treeNode1));

		// null - not null
		assertFalse(treeNode3.equalStructure(treeNode1));
		assertFalse(treeNode1.equalStructure(treeNode3));

		// null included - null not included
		assertFalse(treeNode3.equalStructure(treeNode4));
		assertFalse(treeNode4.equalStructure(treeNode3));

		// right treeNode different
		assertFalse(treeNode4.equalStructure(treeNode5));
		assertFalse(treeNode5.equalStructure(treeNode4));

		// childNodes swapped
		assertFalse(treeNode4.equalStructure(treeNode6));
		assertFalse(treeNode6.equalStructure(treeNode4));

		// equal
		assertTrue(treeNode4.equalStructure(treeNode7));
		assertTrue(treeNode7.equalStructure(treeNode4));

		// left childNode has childNodes
		assertFalse(treeNode4.equalStructure(treeNode8));
		assertFalse(treeNode8.equalStructure(treeNode4));

		// right childNode has childNodes
		assertFalse(treeNode4.equalStructure(treeNode11));
		assertFalse(treeNode11.equalStructure(treeNode4));

		// same values but right childNode has childNodes
		assertFalse(treeNode4.equalStructure(treeNode12));
		assertFalse(treeNode12.equalStructure(treeNode4));

		// multiple childNodes
		assertTrue(treeNode9.equalStructure(treeNode10));
		assertTrue(treeNode10.equalStructure(treeNode9));

		// multiple childNodes
		assertFalse(treeNode10.equalStructure(treeNode11));
		assertFalse(treeNode11.equalStructure(treeNode10));
	}
}
