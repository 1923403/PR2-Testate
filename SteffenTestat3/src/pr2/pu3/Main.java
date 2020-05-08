package pr2.pu3;

public class Main {

	public static void main(String[] args) {
		// AUFGABE 1
		var intList = new ListNode<>(1,
				new ListNode<>(1, new ListNode<>(2, new ListNode<>(3, new ListNode<>(5, new ListNode<>(8))))));

		var stringList = new ListNode<>("Hallo", new ListNode<>("Welt",
				new ListNode<>("das", new ListNode<>("Wetter", new ListNode<>("ist", new ListNode<>("schön"))))));

		System.out.println(intList.toListString());
		System.out.println(stringList.toListString());

		String s = "schön";

		System.out.println(stringList.containsIter(s));
//		System.out.println(stringList.contains(s));
	}
}
