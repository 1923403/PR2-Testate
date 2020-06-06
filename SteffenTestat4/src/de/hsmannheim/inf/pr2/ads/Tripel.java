package de.hsmannheim.inf.pr2.ads;

/**
 * AUFGABE 1<br>
 * <br>
 * This class contains three values which implement the interface Comparable<>.
 * So the values do not have to be of the same data type.
 * 
 * @author Gruppe 25: Floris (1921233), Raphael (1926543), Steffen (1923403)
 * 
 * @param <U> represents a data type which implements Comparable<>
 * @param <V> represents a data type which implements Comparable<>
 * @param <W> represents a data type which implements Comparable<>
 **/
public class Tripel<U extends Comparable<U>, V extends Comparable<V>, W extends Comparable<W>> {

	protected U u;
	protected V v;
	protected W w;

	/**
	 * Creates an instance of Tripel.
	 * 
	 * @param u value of a data type which implements Comparable<>
	 * @param v value of a data type which implements Comparable<>
	 * @param w value of a data type which implements Comparable<>
	 */
	public Tripel(U u, V v, W w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}

	/**
	 * Creates a String in form of "uvw".
	 */
	public String toString() {
		return (u.toString() + v.toString() + w.toString());
	}
}
