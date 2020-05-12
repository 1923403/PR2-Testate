package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TreeNodeTest {

	/*
	 * AUFGABE 5
	 */

	@Test
	void isEmpty() {

		var intTreeA = new TreeNode<Integer>(0, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(54)),
				new TreeNode<>(5));
		var intTreeB = new TreeNode<Object>(null);
		var intTreeC = new TreeNode<Object>(null);
		
		var intTreeD = new TreeNode<Object>(null,intTreeC, intTreeB);
		TreeNode<Integer> intTreeE = null;

		assertEquals(true, intTreeD.isEmpty());
	
//		assertEquals(false, intTreeA.equalStructure(intTreeE));
//		assertEquals(false, intTreeE.equalStructure(intTreeA));

	}

}
