package pr2.pu3;

public class Main {

	public static void main(String[] args) {
		// AUFGABE 1
//		var intList = new ListNode<>(1,
//				new ListNode<>(1, new ListNode<>(2, new ListNode<>(3, new ListNode<>(5, new ListNode<>(8))))));
//
//		var stringList = new ListNode<>("Hallo", new ListNode<>("Welt",
//				new ListNode<>("das", new ListNode<>("Wetter", new ListNode<>("ist", new ListNode<>("schön"))))));
//
//		System.out.println(intList.toListString());
//		System.out.println(stringList.toListString());
//
//		String s = "schön";
//
//		System.out.println(stringList.containsIter(s));
//		System.out.println(stringList.contains(s));

//		Aufgabe 5

//		var intTreeA = new TreeNode<Integer>(0,new TreeNode<>(233), new TreeNode<>(675));
		var intTreeB = new TreeNode<Integer>(0, new TreeNode<>(3,new TreeNode<>(38), new TreeNode<>(54)), new TreeNode<>(5));
			var intTreeA = new TreeNode<Integer>(0, new TreeNode<>(3,new TreeNode<>(38), new TreeNode<>(54)), new TreeNode<>(5));

		
		intTreeA.printInorder();
		intTreeB.printInorder();
		
		//compareCaller(node1,node2);

		System.out.println(intTreeA.equalStructure(intTreeB));
	}
}
