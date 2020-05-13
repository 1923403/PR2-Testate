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
//		var treeNode1 = new TreeNode<>(null);
//		var treeNode2 = new TreeNode<>(5, new TreeNode<>(1), null);
//		var treeNode3 = new TreeNode<>(5, new TreeNode<>(1), new TreeNode<>(7));
//		var treeNode4 = new TreeNode<>(5, new TreeNode<>(1), new TreeNode<>(6));
//		var treeNode5 = new TreeNode<>(5, new TreeNode<>(7), new TreeNode<>(1));
//		var treeNode6 = new TreeNode<>(5, new TreeNode<>(7), new TreeNode<>(1));
//		var treeNode7 = new TreeNode<>(6, new TreeNode<>(7), new TreeNode<>(1));
//		
//		System.out.println(treeNode5.equalStructure(treeNode6));
//		System.out.println(treeNode6.equalStructure(treeNode7));

//		var intTreeA = new TreeNode<Integer>(0, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(54)),
//				new TreeNode<>(5));
//		var intTreeB = new TreeNode<Integer>(0, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(55)),
//				new TreeNode<>(5));
//		var intTreeC = new TreeNode<Integer>(null);
//		var intTreeD = new TreeNode<Integer>(null);

//		intTreeA.printInorder();
//		intTreeB.printInorder();
//		intTreeA=null;
//		intTreeB=null;
//		System.out.println(intTreeA.equalStructure(intTreeB));
//		System.out.println(intTreeC.equalStructure(intTreeD));

//		SearchTree<Integer> st = new SearchTree<>();

//		var intTreeA = new TreeNode<>(0, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(54)), new TreeNode<>(5));
//		var intTreeB = new TreeNode<>(0, new TreeNode<>(3, new TreeNode<>(38), new TreeNode<>(55)), new TreeNode<>(5));
//		var intTreeC = new TreeNode<>(null);
//		var intTreeD = new TreeNode<>(1, new TreeNode<>(2), new TreeNode<>(3));
//		String inte = 5;

//		Integer a = 5;
//
//		System.out.println(st.add(3));
//		System.out.println(st.add(3));
//		System.out.println(st.isEmpty());

		var searchTree = new SearchTree<Integer>();
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		searchTree.add((int) (Math.random() * 100));
		System.out.println(searchTree.height());
//		searchTree.printInorder();
	}
}
