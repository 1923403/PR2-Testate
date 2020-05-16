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
	public boolean contains(E o) {
		return containsReturn(o, this.root);
	}

	private boolean containsReturn(E o, TreeNode<E> node) {
		if (node == null)
			return false;

		if (node.getValue().equals(o)) {
			return true;
		} else if (o.compareTo(node.getValue()) < 0) {
			// element is smaller than current value -> continue searching on the left side
			return containsReturn(o, node.getLeft());
		} else {
			// element is smaller than current value -> continue searching on the right side
			return containsReturn(o, node.getRight());
		}
	}

	/*
	 * AUFGABE 9
	 */
//	public boolean contains(E o, TreeNode<E> node) {
//		if (node == null)
//			return false;
//		else if (node.getValue().equals(o))
//			return true;
//		else {
//			boolean left = contains(o, node.getLeft());
//			boolean right = contains(o, node.getRight());
//
//			if (left == true || right == true)
//				return true;
//			else
//				return false;
//		}
//	}

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
	 * Überprüft, ob der Baum Elemente enthält.
	 *
	 * @return Wahr, wenn der Baum leer ist, falsch sonst.
	 */
	public boolean isEmpty() {
//		try {
//			return this.root.equals(null);
//		} catch (NullPointerException npe) {
//			return true;
//		}

		return (this.root == null);
	}

	/**
	 * Entfernt alle Elemente aus dem Baum.
	 */
	public void clear() {
		this.root = null;
	}

	/**
	 * Bestimme die Höhe des Baums.
	 *
	 * @return
	 */
	public int height() {
		return heightReturn(this.root);
	}

	private int heightReturn(TreeNode<E> node) {
		if (node == null)
			return 0;
		else {
			int left = heightReturn(node.getLeft());
			int right = heightReturn(node.getRight());

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
