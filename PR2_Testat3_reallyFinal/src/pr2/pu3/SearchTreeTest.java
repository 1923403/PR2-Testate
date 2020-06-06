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
		assertTrue(searchTree.root.isEmpty());
		searchTree.add(null);
		assertFalse(searchTree.root.isEmpty());

		var searchTree2 = new SearchTree<Integer>();
		assertTrue(searchTree2.root.isEmpty());
		searchTree2.add(5);
		assertFalse(searchTree2.root.isEmpty());
	}

	/*
	 * AUFGABE 7
	 */
	@Test
	void testClear() {
		var searchTree = new SearchTree<Integer>();
		assertTrue(searchTree.root.isEmpty());
		searchTree.add(1);
		assertFalse(searchTree.root.isEmpty());
		searchTree.clear();
		assertTrue(searchTree.root.isEmpty());
	}

	/*
	 * AUFGABE 8
	 */
	@Test
	void testHeight() {
		var searchTree = new SearchTree<Integer>();

		// searchTree contains no element
		assertEquals(0, searchTree.height());

		// level 1
		searchTree.add(100);
		assertEquals(1, searchTree.height());

		// level 2, left childNode of 100
		searchTree.add(50);
		// level 2, right childNode of 100
		searchTree.add(150);
		assertEquals(2, searchTree.height());

		// level 3, left childNode of 50
//		searchTree.add(25);
		// level 3, right childNode of 50
//		searchTree.add(75);
		// level 3, left childNode of 150
		searchTree.add(125);
		// level 3, right childNode of 150
//		searchTree.add(175);
		assertEquals(3, searchTree.height());

		// level 4, left childNode of 25
//		searchTree.add(20);
		// level 4, right childNode of 25
//		searchTree.add(30);
		// level 4, left childNode of 75
//		searchTree.add(70);
		// level 4, right childNode of 75
//		searchTree.add(80);
		// level 4, left childNode of 125
//		searchTree.add(120);
		// level 4, right childNode of 125
		searchTree.add(130);
		// level 4, left childNode of 175
//		searchTree.add(170);
		// level 4, right childNode of 175
//		searchTree.add(180);
		assertEquals(4, searchTree.height());
	}

	/*
	 * AUFGABE 9
	 */
	@Test
	void testContains() {
		var searchTree = new SearchTree<Integer>();

		// level 1
		searchTree.add(100);
		assertTrue(searchTree.contains(100));
		assertFalse(searchTree.contains(101));

		// level 2, left childNode of 100
		assertFalse(searchTree.contains(50));
		searchTree.add(50);
		assertTrue(searchTree.contains(50));
		// level 2, right childNode of 100
		searchTree.add(150);
		assertTrue(searchTree.contains(150));

		// level 3, left childNode of 50
		searchTree.add(25);
		assertTrue(searchTree.contains(25));

		// level 3, right childNode of 50
		searchTree.add(75);
		assertTrue(searchTree.contains(75));
		// level 3, left childNode of 150
		searchTree.add(125);
		assertTrue(searchTree.contains(125));
		// level 3, right childNode of 150
		searchTree.add(175);
		assertTrue(searchTree.contains(175));

		// level 4, left childNode of 25
		searchTree.add(20);
		assertTrue(searchTree.contains(20));
		// level 4, right childNode of 25
		searchTree.add(30);
		assertTrue(searchTree.contains(30));
		// level 4, left childNode of 75
		searchTree.add(70);
		assertTrue(searchTree.contains(70));
		// level 4, right childNode of 75
		searchTree.add(80);
		assertTrue(searchTree.contains(80));
		// level 4, left childNode of 125
		searchTree.add(120);
		assertTrue(searchTree.contains(120));
		// level 4, right childNode of 125
		searchTree.add(130);
		assertTrue(searchTree.contains(130));
		// level 4, left childNode of 175
		searchTree.add(170);
		assertTrue(searchTree.contains(170));
		// level 4, right childNode of 175
		searchTree.add(180);
		assertTrue(searchTree.contains(180));

	}

	@Test
	void testSort() {
		var searchTree = new SearchTree<Integer>();
		searchTree.add(100);
		searchTree.add(50);
		searchTree.add(150);
		assertEquals("[50, 100, 150]", searchTree.sort().toString());

	}
}
