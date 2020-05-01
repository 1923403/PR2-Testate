package pr2.pu2;

import java.util.Comparator;

public class MyComparator<E extends Tier> implements Comparator<E> {

	public int compare(E tier1, E tier2) {
		if (tier1.health > tier2.health)
			return -1;
		else if (tier1.health == tier2.health)
			return 0;
		else
			return 1;
	}
}
