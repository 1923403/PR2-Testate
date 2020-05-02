package pr2.pu2;

import java.util.Comparator;

/**
 * This is the custom comparator.
 */
public class MyComparator implements Comparator<Tier> {

	/**
	 * This compares the hp of two animals. They are sorted in descending order.
	 */
	public int compare(Tier tier1, Tier tier2) {
		return tier2.hp - tier1.hp;
	}
}
