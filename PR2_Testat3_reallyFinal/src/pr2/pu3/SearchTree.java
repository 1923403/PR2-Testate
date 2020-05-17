package pr2.pu3;

import java.util.Iterator;

/**
 * Ein binärer Suchbaum.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SearchTree<E extends Comparable<E>> implements Set<E> {

	protected SearchTreeNode<E> root; // Wurzelknoten dieses Suchbaums.

	/**
	 * Füge einen Wert in den Baum hinzu. Das geht nur, wenn dieser Wert noch nicht
	 * enthalten ist.
	 *
	 * @param o Einzufügendes Objekt.
	 * @return True, wenn Wert hinzugefügt wurde, oder false, wenn nicht, da dieser
	 *         schon vorhanden war.
	 */
	public boolean add(E o) {
		// Strategie: Wir suchen den Knoten, der nach dem Einfügen des neues
		// Elements der Elternknoten ist.

		TreeNode<E> parent = null; // (Vorläufiger) Elternknoten
		TreeNode<E> node = root; // (Vorläufiger) Kindknoten

		// Solange der aktuelle Kindknoten nicht null ist...
		while (node != null) {
			// Setze alten Kindknoten als neuen Elternknoten:
			parent = node;
			// Ist der Wert bereits in diesem Knoten gespeichert?
			if (node.getValue().equals(o)) {
				return false; // Ja, also kann er nicht nochmal eingefügt werden.
			} else if (o.compareTo(node.getValue()) < 0) {
				// Der einzufügende Wert ist kleiner als der aktuelle Knoten.
				node = node.getLeft(); // D.h. suche im linken Teilbaum weiter.
			} else {
				// Der einzufügende Wert ist größer als der aktuelle Knoten.
				node = node.getRight(); // D.h. suche im rechten Teilbaum weiter.
			}
		}
		// Erzeuge den neuen Knoten für den einzufügenden Wert:
		SearchTreeNode<E> newNode = new SearchTreeNode<>(o);
		if (parent == null) {
			// Kein Elternknoten gefunden. D.h. Baum ist leer.
			root = newNode; // Neuer Knoten wird Wurzelelement.
		} else if (o.compareTo(parent.getValue()) < 0) {
			// Hier wird festgestellt, ob der neue Knoten der rechte oder linke
			// Nachfolger des Elternknotens ist.
			parent.left = newNode; // In diesem Fall links.
		} else {
			parent.right = newNode; // Dito für rechts.
		}
		return true; // Neuer Wert konnte erfolgreich eingefügt werden.
	}

	/**
	 * Suche ein Element in dem Baum.
	 *
	 * @param o Objekt bzw. Suchschlüssel
	 * @return Wahr, wenn Wert im Baum vorhanden ist, falsch sonst.
	 */
//	public boolean contains(E o) {
//		// Iterative Variante
//		TreeNode<E> n = root; // Erzeuge Zeiger, der bei root beginnt.
//
//		while (n != null) {
//			if (n.getValue().equals(o)) {
//				return true; // Element gefunden.
//			} else if (o.compareTo(n.getValue()) < 0) {
//				// Suchschlüssel kleiner, also im linken Teilbaum weitersuchen.
//				n = n.getLeft();
//			} else {
//				// Suchschlüssel größer, also im rechtenTeilbaum weitersuchen.
//				n = n.getRight();
//			}
//		}
//		return false; // Suche zu Ende, Wert nicht gefunden.
//	}

	/**
	 * AUFGABE 9
	 * 
	 * Examines recursively if tree contains a certain element.
	 * 
	 * @param o    element which will be searched for
	 * @param node tree node from which the search starts
	 * 
	 * @return Returns a boolean. True if the tree contains the element, false if
	 *         not.
	 */
	public boolean contains(E o) {
		return returnContains(o, this.root);
	}

	private boolean returnContains(E o, TreeNode<E> node) {
		if (node == null)
			return false;

		if (node.getValue().equals(o)) {
			return true;
		} else if (o.compareTo(node.getValue()) < 0) {
			// element is smaller than current value -> continue searching on the left side
			return returnContains(o, node.getLeft());
		} else {
			// element is smaller than current value -> continue searching on the right side
			return returnContains(o, node.getRight());
		}
	}

	/**
	 * Entfernt einen Knoten mit dem Wert o aus dem Baum.
	 *
	 * @param o Objekt/Schlüssel, der entfernt werden soll
	 * @return True, falls Element entfernt wurde, false sonst.
	 */
	public boolean remove(E o) {
		// Noch nicht implementiert. Achtung: aufwändig!
		return false;
	}

	/**
	 * @return Anzahl der Elemente in dem Baum.
	 */
	public int size() {
		if (isEmpty()) { // Sonderfall leerer Baum beachten!
			return 0; // Leerer Baum hat Größe 0.
		} else {
			return root.size(); // Nimm Gr��e des fkt. Baums.
		}
	}

	/**
	 * AUFGABE 6
	 * 
	 * Examines if this tree contains elements.
	 *
	 * @return Returns a boolean. True if tree contains elements, false if not.
	 */
	public boolean isEmpty() {
		return (this.root == null);
	}

	/**
	 * AUFGABE 7
	 * 
	 * Removes all elements from this tree.
	 */
	public void clear() {
		this.root = null;
	}

	/**
	 * AUFGABE 8
	 * 
	 * Examines recursively the height of this tree.
	 * 
	 * @param node node of a tree
	 *
	 * @return Returns the height of a tree as an integer value.
	 */
	public int height() {
		return returnHeight(this.root);
	}

	private int returnHeight(TreeNode<E> node) {
		if (node == null)
			return 0;
		else {
			int left = returnHeight(node.getLeft());
			int right = returnHeight(node.getRight());

			if (left > right)
				return (left + 1);
			else
				return (right + 1);
		}
	}

	public void printInorder() {
		if (!isEmpty()) {
			root.printInorder();
		}
	}

	public Iterator<E> iterator() {
		// Noch nicht implementiert.
		return null;
	}

}
