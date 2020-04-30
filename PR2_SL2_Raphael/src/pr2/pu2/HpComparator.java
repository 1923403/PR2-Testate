package pr2.pu2;

import java.util.Comparator;

public class HpComparator implements Comparator<Tier> {
	
	// Used for sorting in descending order of hp
	@Override
	public int compare(Tier b, Tier a) {
		return a.hp - b.hp;
	}
}
