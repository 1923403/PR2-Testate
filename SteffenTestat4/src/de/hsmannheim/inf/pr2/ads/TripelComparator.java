package de.hsmannheim.inf.pr2.ads;

import java.util.Comparator;

public class TripelComparator<T extends Tripel<?, ?, ?>> implements Comparator<T> {

	private final int sortKey;

	public TripelComparator(int sortKey) {
		if (sortKey <= 1)
			this.sortKey = 1;
		else if (sortKey >= 6)
			this.sortKey = 6;
		else
			this.sortKey = sortKey;
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
