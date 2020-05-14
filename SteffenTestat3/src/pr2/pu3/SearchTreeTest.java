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
		searchTree.add(null);		
		assertFalse(searchTree.isEmpty());
		
		var searchTree2 = new SearchTree<Integer>();
		assertTrue(searchTree2.isEmpty());
		searchTree2.add(5);		
		assertFalse(searchTree2.isEmpty());
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

	/*
	 * AUFGABE 8
	 */
	@Test
	void testHeight() {
		var searchTree = new SearchTree<Integer>();

		// searchTree contains no element
		assertEquals(0, searchTree.height(searchTree.root));

		// level 1
		searchTree.add(100);
		assertEquals(1, searchTree.height(searchTree.root));

		// level 2, left childNode of 100
		searchTree.add(50);
		// level 2, right childNode of 100
		searchTree.add(150);
		assertEquals(2, searchTree.height(searchTree.root));

		// level 3, left childNode of 50
//		searchTree.add(25);
		// level 3, right childNode of 50
//		searchTree.add(75);
		// level 3, left childNode of 150
		searchTree.add(125);
		// level 3, right childNode of 150
//		searchTree.add(175);
		assertEquals(3, searchTree.height(searchTree.root));

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
		assertEquals(4, searchTree.height(searchTree.root));
	}

	/*
	 * AUFGABE 9
	 */
	@Test
	void testContains() {
		var searchTree = new SearchTree<Integer>();

		// level 1
		searchTree.add(100);
		assertTrue(searchTree.contains(100, searchTree.root));
		assertFalse(searchTree.contains(101, searchTree.root));

		// level 2, left childNode of 100
		assertFalse(searchTree.contains(50, searchTree.root));
		searchTree.add(50);
		assertTrue(searchTree.contains(50, searchTree.root));
		// level 2, right childNode of 100
		searchTree.add(150);
		assertTrue(searchTree.contains(150, searchTree.root));

		// level 3, left childNode of 50
		searchTree.add(25);
		assertTrue(searchTree.contains(25, searchTree.root));

		// level 3, right childNode of 50
		searchTree.add(75);
		assertTrue(searchTree.contains(75, searchTree.root));
		// level 3, left childNode of 150
		searchTree.add(125);
		assertTrue(searchTree.contains(125, searchTree.root));
		// level 3, right childNode of 150
		searchTree.add(175);
		assertTrue(searchTree.contains(175, searchTree.root));

		// level 4, left childNode of 25
		searchTree.add(20);
		assertTrue(searchTree.contains(20, searchTree.root));
		// level 4, right childNode of 25
		searchTree.add(30);
		assertTrue(searchTree.contains(30, searchTree.root));
		// level 4, left childNode of 75
		searchTree.add(70);
		assertTrue(searchTree.contains(70, searchTree.root));
		// level 4, right childNode of 75
		searchTree.add(80);
		assertTrue(searchTree.contains(80, searchTree.root));
		// level 4, left childNode of 125
		searchTree.add(120);
		assertTrue(searchTree.contains(120, searchTree.root));
		// level 4, right childNode of 125
		searchTree.add(130);
		assertTrue(searchTree.contains(130, searchTree.root));
		// level 4, left childNode of 175
		searchTree.add(170);
		assertTrue(searchTree.contains(170, searchTree.root));
		// level 4, right childNode of 175
		searchTree.add(180);
		assertTrue(searchTree.contains(180, searchTree.root));
	}

	@Test
	void testContains2() {
		var searchTree = new SearchTree<Integer>();

		// level 1
		searchTree.add(100);
		assertTrue(searchTree.contains2(100, searchTree.root));
		assertFalse(searchTree.contains2(101, searchTree.root));

		// level 2, left childNode of 100
		assertFalse(searchTree.contains2(50, searchTree.root));
		searchTree.add(50);
		assertTrue(searchTree.contains2(50, searchTree.root));
		// level 2, right childNode of 100
		searchTree.add(150);
		assertTrue(searchTree.contains2(150, searchTree.root));

		// level 3, left childNode of 50
		searchTree.add(25);
		assertTrue(searchTree.contains2(25, searchTree.root));

		// level 3, right childNode of 50
		searchTree.add(75);
		assertTrue(searchTree.contains2(75, searchTree.root));
		// level 3, left childNode of 150
		searchTree.add(125);
		assertTrue(searchTree.contains2(125, searchTree.root));
		// level 3, right childNode of 150
		searchTree.add(175);
		assertTrue(searchTree.contains2(175, searchTree.root));

		// level 4, left childNode of 25
		searchTree.add(20);
		assertTrue(searchTree.contains2(20, searchTree.root));
		// level 4, right childNode of 25
		searchTree.add(30);
		assertTrue(searchTree.contains2(30, searchTree.root));
		// level 4, left childNode of 75
		searchTree.add(70);
		assertTrue(searchTree.contains2(70, searchTree.root));
		// level 4, right childNode of 75
		searchTree.add(80);
		assertTrue(searchTree.contains2(80, searchTree.root));
		// level 4, left childNode of 125
		searchTree.add(120);
		assertTrue(searchTree.contains2(120, searchTree.root));
		// level 4, right childNode of 125
		searchTree.add(130);
		assertTrue(searchTree.contains2(130, searchTree.root));
		// level 4, left childNode of 175
		searchTree.add(170);
		assertTrue(searchTree.contains2(170, searchTree.root));
		// level 4, right childNode of 175
		searchTree.add(180);
		assertTrue(searchTree.contains2(180, searchTree.root));
	}
	
	static SearchTree<Integer> searchTree = MyTest.searchTree;
	
	@Test
	void testContains3() {
		assertTrue(SearchTreeTest.searchTree.contains(40000000, MyTest.searchTree.root));
	}
	
	@Test
	void testContains4() {
		assertTrue(SearchTreeTest.searchTree.contains2(40000000, MyTest.searchTree.root));
	}
}
