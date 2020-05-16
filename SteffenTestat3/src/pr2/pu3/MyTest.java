package pr2.pu3;

public class MyTest {
	static SearchTree<Integer> searchTree = MyTest.createTree();
	
	static SearchTree<Integer> createTree() {
		var tmp = new SearchTree<Integer>();
		for (int i = 0; i < 50000000; i++) {
			tmp.add((int) (Math.random() * 1500000000));
		}
		tmp.add(40000000);
		
		return tmp;
	}
}
