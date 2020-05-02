package pr2.pu2;

import java.util.Comparator;

public class MyComparator implements Comparator<Tier> {

	public int compare(Tier tier1, Tier tier2) {
		return tier2.hp - tier1.hp;
	}
}
