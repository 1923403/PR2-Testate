package de.hsmannheim.inf.pr2.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class TripleComparatorTest {

	@Test
	void testCompareCase1() {
		// u ascending
		var tripel1 = new Tripel<>(2, 3, 4);
		var tripel2 = new Tripel<>(1, 2, 3);
		List<Tripel<Integer, Integer, Integer>> arrayList = new ArrayList<>();
		arrayList.add(tripel1);
		arrayList.add(tripel2);

		System.out.println("Before sort:");

		for (var element : arrayList)
			System.out.println("[" + element.u + "" + element.v + "" + element.w + "]");

		Collections.sort(arrayList,
				new TripelComparator<Tripel<Integer, Integer, Integer>, Integer, Integer, Integer>(1));

		System.out.println("After sort:");

		for (var element : arrayList)
			System.out.println("[" + element.u + "" + element.v + "" + element.w + "]");
		
		// v ascending
		var tripel3 = new Tripel<>(2, 3, 4);
		var tripel4 = new Tripel<>(2, 2, 3);
		arrayList = new ArrayList<>();
		arrayList.add(tripel3);
		arrayList.add(tripel4);

		System.out.println("Before sort:");

		for (var element : arrayList)
			System.out.println("[" + element.u + "" + element.v + "" + element.w + "]");

		Collections.sort(arrayList,
				new TripelComparator<Tripel<Integer, Integer, Integer>, Integer, Integer, Integer>(1));

		System.out.println("After sort:");

		for (var element : arrayList)
			System.out.println("[" + element.u + "" + element.v + "" + element.w + "]");
		
		// w ascending
		var tripel5 = new Tripel<>(2, 3, 4);
		var tripel6 = new Tripel<>(2, 3, 3);
		arrayList = new ArrayList<>();
		arrayList.add(tripel3);
		arrayList.add(tripel4);

		System.out.println("Before sort:");

		for (var element : arrayList)
			System.out.println("[" + element.u + "" + element.v + "" + element.w + "]");

		Collections.sort(arrayList,
				new TripelComparator<Tripel<Integer, Integer, Integer>, Integer, Integer, Integer>(1));

		System.out.println("After sort:");

		for (var element : arrayList)
			System.out.println("[" + element.u + "" + element.v + "" + element.w + "]");
	}
	
	@Test
	void testCompareCase2() {
		
	}
	
	@Test
	void testCompareCase3() {
		
	}
	
	@Test
	void testCompareCase4() {
		
	}
	
	@Test
	void testCompareCase5() {
		
	}
	
	@Test
	void testCompareCase6() {
		
	}
}
