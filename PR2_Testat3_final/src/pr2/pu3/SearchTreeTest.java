package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("SearchTree-Tests")
class SearchTreeTest {

	/*
	 * AUFGABE 6
	 */
	@Test
	void testIsEmpty() {
		var searchTree = new SearchTree<Integer>();
		assertTrue(searchTree.isEmpty());
		searchTree.add(1);
		assertFalse(searchTree.isEmpty());
	}

	/*
	 * AUFGABE 7
	 */
	@Test
	void testClear() {
		var searchTree = new SearchTree<Integer>();
		assertTrue(searchTree.isEmpty());
		searchTree.add(1);
		assertFalse(searchTree.isEmpty());
		searchTree.clear();
		assertTrue(searchTree.isEmpty());
	}
}
