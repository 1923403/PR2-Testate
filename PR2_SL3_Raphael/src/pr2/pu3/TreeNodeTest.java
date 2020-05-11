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
		var intTreeB = new TreeNode<>(0, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(54)),
				new TreeNode<>(5));
		var intTreeC = new TreeNode<Integer>(7, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(54)),
				new TreeNode<>(5));
		var intTreeD = new TreeNode<Integer>(null, new TreeNode<>(3), new TreeNode<>(5));
		var intTreeF = new TreeNode<Integer>(null);
		var intTreeG = new TreeNode<Integer>(null);

		assertEquals(true, intTreeA.equalStructure(intTreeB));
		assertEquals(false, intTreeA.equalStructure(intTreeC));
		assertEquals(false, intTreeA.equalStructure(intTreeD));
		assertEquals(true, intTreeF.equalStructure(intTreeG));
		assertEquals(false, intTreeG.equalStructure(intTreeB));
//		assertEquals(false, intTreeA.equalStructure(intTreeE));
//		assertEquals(false, intTreeE.equalStructure(intTreeA));

	}

}
