package pr2.pu2;

import java.util.Comparator;

public class MyComparator<E extends Tier> implements Comparator<E> {

	public int compare(E tier1, E tier2) {
		return tier2.health - tier1.health;
	}
}
