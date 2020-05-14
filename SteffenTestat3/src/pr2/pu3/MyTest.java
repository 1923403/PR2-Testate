package pr2.pu3;

public class MyTest {
	static SearchTree<Integer> searchTree = createTree();
	
	static SearchTree<Integer> createTree() {
		for (int i = 0; i < 1000000000; i++) {
			searchTree.add((int) (Math.random() * 100000));
		}
		searchTree.add(200000);
		
		return searchTree;
	}
}
