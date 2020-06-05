package de.hsmannheim.inf.pr2.ads;

import java.util.Comparator;

public class TripelComparator<T extends Tripel<E, F, G>, E extends Comparable<E>, F extends Comparable<F>, G extends Comparable<G>>
		implements Comparator<T> {

	private final int sortKey;

	public TripelComparator(int sortKey) {
		this.sortKey = sortKey;
	}

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
