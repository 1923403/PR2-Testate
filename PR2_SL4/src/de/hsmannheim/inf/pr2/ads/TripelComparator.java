package de.hsmannheim.inf.pr2.ads;

import java.util.Comparator;

public class TripelComparator<T extends Tripel<E, F, G>, E extends Comparable<E>, F extends Comparable<F>, G extends Comparable<G>>
		implements Comparator<T> {
	final int i;

	public TripelComparator(int i) {
		this.i = i;
	}

	@Override
	public int compare(T t1, T t2) {
		switch (i) {
		case 1:
			if (t1.u.compareTo(t2.u) != 0) 
				return t1.u.compareTo(t2.u);
			 else if (t1.v.compareTo(t2.v) != 0) 
				return t1.v.compareTo(t2.v);
			 else
				return t1.w.compareTo(t2.w);

		
		case 2:
			System.out.println("i ist 2");
			break;
		case 3:
			System.out.println("i ist 3");
			break;
		case 4:
			System.out.println("i ist 4");
			break;
		case 5:
			System.out.println("i ist 5");
			break;
		case 6:
			System.out.println("i ist 6");
			break;
		default:
			System.out.println("Fehler");
			break;
		}
		return 0;
	}

}
