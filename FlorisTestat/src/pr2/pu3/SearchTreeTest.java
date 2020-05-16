package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("SearchTree-Tests")
class SearchTreeTest {

	/*
	 * AUFGABE 6
	 */
	
	
	/*
	 * AUFGABE 8
	 */
	@Test
	void testHeight() {		var searchTree = new SearchTree<Integer>();
		
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
		searchTree.add(25);
		// level 3, right childNode of 50
		searchTree.add(75);
		
		// level 3, left childNode of 150
//		searchTree.add(125);
		// level 3, right childNode of 150
//		searchTree.add(175);
		assertEquals(3, searchTree.height());
//		
		// level 4, left childNode of 25
		searchTree.add(20);
		// level 4, right childNode of 25
//		searchTree.add(30);
		// level 4, left childNode of 75
		searchTree.add(70);
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
//		
// level 5, left childNode of 70
		searchTree.add(65);
		
		// level 5, left childNode of 20
		searchTree.add(15);
		// level 6, left childNode of 65
				searchTree.add(60);		
				// level 6, left childNode of 15
				searchTree.add(10);
				// level 7, left childNode of 60
				searchTree.add(55);
			assertEquals(7, searchTree.height());
	}
}
