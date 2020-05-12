package pr2.pu3;

import java.util.Iterator;


/**
 * Ein bin√§rer Suchbaum.
 *
 * @author Markus Gumbel (m.gumbel@hs-mannheim.de)
 */
public class SearchTree<E extends Comparable<E>> implements Set<E> {

  protected SearchTreeNode<E> root; // Wurzelknoten dieses Suchbaums.


  /**
   * F√ºge einen Wert in den Baum hinzu. Das geht nur, wenn dieser
   * Wert noch nicht enthalten ist.
   *
   * @param o Einzuf√ºgendes Objekt.
   * @return True, wenn Wert hinzugef√ºgt wurde, oder false, wenn nicht,
   * da dieser schon vorhanden war.
   */
  public boolean add(E o) {
    // Strategie: Wir suchen den Knoten, der nach dem Einf¸gen des neuen
    // Elements der Elternknoten ist.

    TreeNode<E> parent = null; // (Vorl‰ufiger) Elternknoten
    TreeNode<E> node = root; // (Vorl‰ufiger) Kindknoten

    // Solange der aktuelle Kindknoten nicht null ist...
    while (node != null) {
      // Setze alten Kindknoten als neuen Elternknoten:
      parent = node;
      // Ist der Wert bereits in diesem Knoten gespeichert?
      if (node.getValue().equals(o)) {
        return false; // Ja, also kann er nicht nochmal eingef√ºgt werden.
      } else if (o.compareTo(node.getValue()) < 0) {
        // Der einzuf¸gende Wert ist kleiner als der aktuelle Knoten.
        node = node.getLeft(); // D.h. suche im linken Teilbaum weiter.
      } else {
        // Der einzuf¸gende Wert ist grˆﬂer als der aktuelle Knoten.
        node = node.getRight(); // D.h. suche im rechten Teilbaum weiter.
      }
    }
    // Erzeuge den neuen Knoten f¸r den einzuf¸genden Wert:
    SearchTreeNode<E> newNode = new SearchTreeNode<>(o);
    if (parent == null) {
      // Kein Elternknoten gefunden. D.h. Baum ist leer.
      root = newNode; // Neuer Knoten wird Wurzelelement.
    } else if (o.compareTo(parent.getValue()) < 0) {
      // Hier wird festgestellt, ob der neue Knoten der rechte oder linke
      // Nachfolger des Elternknotens ist.
      parent.left = newNode; // In diesem Fall links.
    } else {
      parent.right = newNode; // Dito f¸r rechts.
    }
    return true; // Neuer Wert konnte erfolgreich eingef¸gt werden.
  }


  /**
   * Suche ein Element in dem Baum.
   *
   * @param o Objekt bzw. Suchschl√ºssel
   * @return Wahr, wenn Wert im Baum vorhanden ist, falsch sonst.
   */
  public boolean contains(E o) {
    // Iterative Variante
    TreeNode<E> n = root; // Erzeuge Zeiger, der bei root beginnt.

    while (n != null) {
      if (n.getValue().equals(o)) {
        return true; // Element gefunden.
      } else if (o.compareTo(n.getValue()) < 0) {
        // Suchschl¸ssel kleiner, also im linken Teilbaum weitersuchen.
        n = n.getLeft();
      } else {
        // Suchschl¸ssel grˆﬂer, also im rechten Teilbaum weitersuchen.
        n = n.getRight();
      }
    }
    return false;     // Suche zu Ende, Wert nicht gefunden.
  }

  /**
   * Entfernt einen Knoten mit dem Wert o aus dem Baum.
   *
   * @param o Objekt/Schl√ºssel, der entfernt werden soll
   * @return True, falls Element entfernt wurde, false sonst.
   */
  public boolean remove(E o) {
    // Noch nicht implementiert. Achtung: aufw‰ndig!
    return false;
  }


  /**
   * @return Anzahl der Elemente in dem Baum.
   */
  public int size() {
    if (isEmpty()) { // Sonderfall leerer Baum beachten!
      return 0; // Leerer Baum hat Grˆﬂe 0.
    } else {
      return root.size(); // Nimm Grˆﬂe des fkt. Baums.
    }
  }


  /**
   * ‹berpr¸ft, ob der Baum Elemente enth‰lt.
   *
   * @return Wahr, wenn der Baum leer ist, falsch sonst.
   */
  public boolean isEmpty() {
    // Noch nicht implementiert.
    return false;
  }

  /**
   * Entfernt alle Elemente aus dem Baum.
   */
  public void clear() {
    // Noch nicht implementiert.
  }

  /**
   * Bestimme die Hˆhe des Baums.
   *
   * @return
   */
  public int height() {
    // Noch nicht implementiert.
    return 0;
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

