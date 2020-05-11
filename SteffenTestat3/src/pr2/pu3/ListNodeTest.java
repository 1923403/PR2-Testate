package pr2.pu3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ListNode Tests")
class ListNodeTest {

	/*
	 * AUFGABE 1
	 */
	@Test
	void testContainsIter() {
		var intList = new ListNode<>(1,
				new ListNode<>(1, new ListNode<>(2, new ListNode<>(3, new ListNode<>(5, new ListNode<>(8))))));

		var stringList = new ListNode<>("Hallo", new ListNode<>("Welt",
				new ListNode<>("das", new ListNode<>("Wetter", new ListNode<>("ist", new ListNode<>("schön"))))));

		assertEquals(true, intList.containsIter(1));
		assertEquals(true, intList.containsIter(8));
		assertEquals(false, intList.containsIter(13));

		assertEquals(true, stringList.containsIter("Hallo"));
		assertEquals(true, stringList.containsIter("schön"));
		assertEquals(false, stringList.containsIter("schö"));
	}

	/*
	 * AUFGABE 2
	 */
	@Test
	void testContains() {
		var intList = new ListNode<>(1,
				new ListNode<>(1, new ListNode<>(2, new ListNode<>(3, new ListNode<>(5, new ListNode<>(8))))));

		var stringList = new ListNode<>("Hallo", new ListNode<>("Welt",
				new ListNode<>("das", new ListNode<>("Wetter", new ListNode<>("ist", new ListNode<>("schön"))))));

		assertTrue(intList.contains(1));
		assertTrue(intList.contains(8));
		assertFalse(intList.contains(13));

		assertTrue(stringList.contains("Hallo"));
		assertTrue(stringList.contains("schön"));
		assertFalse(stringList.contains("schö"));
	}

}
