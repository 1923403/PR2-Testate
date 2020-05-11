package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TreeNode Tests")
class TreeNodeTest {

	/*
	 * AUFGABE 5
	 */
	@Test
	void testEqualStructure() {

		var intTreeA = new TreeNode<Integer>(0, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(54)),
				new TreeNode<>(5));
		var intTreeB = new TreeNode<Integer>(0, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(54)),
				new TreeNode<>(5));
		var intTreeC = new TreeNode<Integer>(7, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(54)),
				new TreeNode<>(5));
		var intTreeD = new TreeNode<Integer>(7, new TreeNode<>(3), new TreeNode<>(5));
		TreeNode<Integer> intTreeE = null;

		assertEquals(true, intTreeA.equalStructure(intTreeB));
		assertEquals(false, intTreeA.equalStructure(intTreeC));
		assertEquals(false, intTreeA.equalStructure(intTreeD));
//		assertEquals(false, intTreeA.equalStructure(intTreeE));

	}

}
