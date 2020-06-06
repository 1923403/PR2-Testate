package de.hsmannheim.inf.pr2.ads;

import java.util.Comparator;

/**
 * AUFGABE 1<br>
 * <br>
 * This class compares the values of two instances of the class Tripel and sorts
 * their values in the requested order.
 * 
 * @author Gruppe 25: Floris (1921233), Raphael (1926543), Steffen (1923403)
 *
 * @param <T> represents a data type which extends from Tripel<>
 * @param <U> represents a data type which implements Comparable<>
 * @param <V> represents a data type which implements Comparable<>
 * @param <W> represents a data type which implements Comparable<>
 */
public class TripelComparator<T extends Tripel<U, V, W>, U extends Comparable<U>, V extends Comparable<V>, W extends Comparable<W>>
		implements Comparator<T> {

	private final int sortKey;

	/**
	 * Creates an instance of TripelComparator.
	 * 
	 * @param sortKey represents the requested compare method
	 */
	public TripelComparator(int sortKey) {
		this.sortKey = sortKey;
	}

	/**
	 * Compares the values of two instances of the class Tripel and sorts their
	 * values in the requested order.<br>
	 * <br>
	 * 1 - u ascending, v ascending, w ascending<br>
	 * 2 - u descending, v descending, w descending<br>
	 * 3 - v ascending, u ascending, w ascending<br>
	 * 4 - v descending, u descending, w descending<br>
	 * 5 - w ascending, v ascending, u ascending<br>
	 * 6 - w descending, v descending, u descending
	 */
	@Override
	public int compare(T o1, T o2) {
		switch (sortKey) {
		case 1:
			if (o1.u.compareTo(o2.u) != 0)
				return o1.u.compareTo(o2.u);
			else if (o1.v.compareTo(o2.v) != 0)
				return o1.v.compareTo(o2.v);
			else
				return o1.w.compareTo(o2.w);
		case 2:
			if (o1.u.compareTo(o2.u) != 0)
				return o1.u.compareTo(o2.u) * -1;
			else if (o1.v.compareTo(o2.v) != 0)
				return o1.v.compareTo(o2.v) * -1;
			else
				return o1.w.compareTo(o2.w) * -1;
		case 3:
			if (o1.v.compareTo(o2.v) != 0)
				return o1.v.compareTo(o2.v);
			else if (o1.u.compareTo(o2.u) != 0)
				return o1.u.compareTo(o2.u);
			else
				return o1.w.compareTo(o2.w);
		case 4:
			if (o1.v.compareTo(o2.v) != 0)
				return o1.v.compareTo(o2.v) * -1;
			else if (o1.u.compareTo(o2.u) != 0)
				return o1.u.compareTo(o2.u) * -1;
			else
				return o1.w.compareTo(o2.w) * -1;
		case 5:
			if (o1.w.compareTo(o2.w) != 0)
				return o1.w.compareTo(o2.w);
			else if (o1.v.compareTo(o2.v) != 0)
				return o1.v.compareTo(o2.v);
			else
				return o1.u.compareTo(o2.u);
		case 6:
			if (o1.w.compareTo(o2.w) != 0)
				return o1.w.compareTo(o2.w) * -1;
			else if (o1.v.compareTo(o2.v) != 0)
				return o1.v.compareTo(o2.v) * -1;
			else
				return o1.u.compareTo(o2.u) * -1;
		default:
			return 0;
		}
	}
}
