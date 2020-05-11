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
		
		// AUFGABE 5
		var treeNode1 = new TreeNode<>(null);
		var treeNode2 = new TreeNode<>(5, new TreeNode<>(1), null);
		var treeNode3 = new TreeNode<>(5, new TreeNode<>(1), new TreeNode<>(7));
		var treeNode4 = new TreeNode<>(5, new TreeNode<>(1), new TreeNode<>(6));
		var treeNode5 = new TreeNode<>(5, new TreeNode<>(7), new TreeNode<>(1));
		var treeNode6 = new TreeNode<>(5, new TreeNode<>(7), new TreeNode<>(1));
		var treeNode7 = new TreeNode<>(6, new TreeNode<>(7), new TreeNode<>(1));
		
		System.out.println(treeNode5.equalStructure(treeNode6));
		System.out.println(treeNode6.equalStructure(treeNode7));
	}
}
