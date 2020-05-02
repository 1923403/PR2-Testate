package pr2.pu2;

import java.util.Comparator;

/**
 * This is the custom comparator.
 */
public class MyComparator<E extends Tier> implements Comparator<E> {

	/**
	 * This compares the hp of two animals. They are sorted in descending order.
	 */
	public int compare(E tier1, E tier2) {
		return tier2.hp - tier1.hp;
	}
}
