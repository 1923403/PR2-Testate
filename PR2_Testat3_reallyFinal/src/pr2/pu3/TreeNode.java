package pr2.pu3;

/**
 * Ein Knoten für einen Binärbaum. Dieser Knoten kann selbst als eigener
 * Binärbaum aufgefasst werden.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class TreeNode<E> {

	protected E value = null; // Wert des Knotens.
	protected TreeNode<E> left = null; // Linker Teilbaum.
	protected TreeNode<E> right = null; // Rechter Teilbaum.

	/**
	 * Erzeuge einen neuen Binärbaum-Knoten. Nachfolger und Vorgänger sind nicht
	 * gesetzt.
	 *
	 * @param v Der Wert des Knotens.
	 */
	public TreeNode(E v) {
		value = v;
		left = right = null;
	}

	/**
	 * Erzeuge einen neuen Binärbaum(-Knoten), entspricht tree().
	 * 
	 * @param value Der Wert des Knotens.
	 * @param left  Der linke Teilbaum.
	 * @param right Der rechte Teilbaum.
	 */
	public TreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public E getValue() {
		return value;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	/**
	 * Bestimme die Höhe des Baums.
	 *
	 * @return
	 */
	public int height() {
		// Noch nicht implementiert.
		return 0;
	}

	/**
	 * Bestimmt die Anzahl der Elemente in diesem Baum.
	 *
	 * @return
	 */
	public int size() {
		return size(this);
	}

	/**
	 * Bestimmt die Anzahl der Elemente in diesem Baum.
	 *
	 * @param node Wurzelknoten eines (Teil-)Baums.
	 * @return
	 */
	private int size(TreeNode<E> node) {
		if (node == null) { // Leerer Baum?
			return 0; // Anzahl Elemente ist 0.
		} else { // Echter Teilbaum.
			// Größe ist dieser Knoten plus solche in den Teilbäumen:
			int sizeLeft = size(node.getLeft());
			int sizeRight = size(node.getRight());
			return 1 + sizeLeft + sizeRight;
		}
	}

	public String toString() {
		return value + " ";
	}

	/**
	 * Gibt den Baum ab dem Wurzelknoten in Inorder-Reihenfolge auf die Konsole aus.
	 */
	public void printInorder() {
		printInorder(this);
		System.out.println(); // Am Ende noch eine neue Zeile.
	}

	/**
	 * Durchläuft einen (Teil-)Baum vom Wurzelknoten an in Inorder-Reihenfolge und
	 * gibt die Werte auf die Konsole aus.
	 *
	 * @param node Wurzelknoten des (Teil-)Baums
	 */
	private void printInorder(TreeNode<E> node) {
		if (node != null) { // Ist der Baum nicht leer?
			// Dann kann weiter gemacht werden.
			printInorder(node.getLeft());
			System.out.println(node.toString());
			printInorder(node.getRight());
		}
	}

	/*
	 * AUFGABE 4
	 */

//	Unsere Grundidee ist, den Baum Knoten f�r Knoten durchzugehen
//	und sobald ein Unterschied auftritt false zur�ckzugeben.
//	Erreicht der Algorithmus das Ende, wird true zur�ckgegeben.
//	Hierbei werden wir rekursiv vorgehen. Allerdings besteht hierbei die Gefahr
//	NullPointerExceptions auszul�sen. Um dies zu vermeiden, m�ssen wir vorher
//	mehrere Bedingungen formulieren, die verhindern, dass die Methode an null ausgef�hrt wird.
//	
//	Zuerst wird der Wert des Knotens, an dem die Methode aufgerufen wurde mit dem Wert
//	des �bergebenen Knotens verglichen. Ist hier kein Unterschied festzustellen, werden nun die linken
//	Kindknoten der beiden miteinander verglichen. Erst wenn sichergestellt ist,
//	dass die zu vergleichenden Objekte beide nicht null sind, ruft sich die Methode 
//	selbst auf (Rekursion). Wird hier auch kein Unterschied festgestellt,
//	werden entsprechend die rechten Kindknoten untersucht.
//	Wird bis hierhin kein Unterschied zwischen den beiden Objekten festgestellt, sind sie identisch
//	und es wird true zur�ckgegeben!

	/**
	 * AUFGABE 5
	 * 
	 * Examines recursively if this binary tree is identical to another binary tree.
	 * 
	 * @param otherNode node of another tree
	 * 
	 * @return Returns a boolean. True if both trees are identical, false if not
	 */
	public boolean equalStructure(TreeNode<E> otherNode) {
		// check if value of this node differs from other node's value
		if (this.getValue() != otherNode.getValue())
			return false;

		// check if left child node of this node differs from left child node of the
		// other node
		if (this.getLeft() != null && otherNode.getLeft() != null) {
			if (!this.getLeft().equalStructure(otherNode.getLeft()))
				return false;
		} else if (this.getLeft() != null || otherNode.getLeft() != null)
			return false;

		// check if right child node of this node differs from right child node of the
		// other node
		if (this.getRight() != null && otherNode.getRight() != null) {
			if (!this.getRight().equalStructure(otherNode.getRight()))
				return false;
		} else if (this.getRight() != null || otherNode.getRight() != null)
			return false;

		return true;
	}
}
