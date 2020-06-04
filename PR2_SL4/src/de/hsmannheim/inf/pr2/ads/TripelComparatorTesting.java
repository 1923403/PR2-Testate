package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class TripelComparatorTesting {
	@Test
	void sortTripelCollection() {
		var intList = new ArrayList<Tripel<Integer, Integer, Integer>>();
		intList.add(new Tripel<Integer, Integer, Integer>(1, 2, 3));
		intList.add(new Tripel<Integer, Integer, Integer>(3, 2, 1));
		intList.add(new Tripel<Integer, Integer, Integer>(2, 2, 2));
		intList.add(new Tripel<Integer, Integer, Integer>(3, 2, 7));
		intList.add(new Tripel<Integer, Integer, Integer>(2, 2, 0));
		System.out.println(intList.toString());
		Collections.sort(intList,
				new TripelComparator<Tripel<Integer, Integer, Integer>, Integer, Integer, Integer>(1));
		System.out.println(intList.toString());

	}
}
