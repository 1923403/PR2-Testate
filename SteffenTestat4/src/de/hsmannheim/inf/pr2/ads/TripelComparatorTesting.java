package de.hsmannheim.inf.pr2.ads;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * AUFGABE 1<br>
 * <br>
 * JUnit tests for TripelComparator.
 * 
 * @author Gruppe 25: Floris (1921233), Raphael (1926543), Steffen (1923403)
 */
public class TripelComparatorTesting {

	// u ascending, v ascending, w ascending
	@Test
	void sortTripel1() {
		var intList = new ArrayList<Tripel<Integer, Integer, Integer>>();

		intList.add(new Tripel<>(2, 0, 0));
		intList.add(new Tripel<>(1, 0, 0));

		intList.add(new Tripel<>(0, 2, 0));
		intList.add(new Tripel<>(0, 1, 0));

		intList.add(new Tripel<>(0, 0, 2));
		intList.add(new Tripel<>(0, 0, 1));

		Collections.sort(intList,
				new TripelComparator<Tripel<Integer, Integer, Integer>, Integer, Integer, Integer>(1));
		assertEquals("[001, 002, 010, 020, 100, 200]", intList.toString());
	}

	// u descending, v descending, w descending
	@Test
	void sortTripel2() {
		var intList = new ArrayList<Tripel<Integer, Integer, Integer>>();

		intList.add(new Tripel<>(1, 0, 0));
		intList.add(new Tripel<>(2, 0, 0));

		intList.add(new Tripel<>(0, 1, 0));
		intList.add(new Tripel<>(0, 2, 0));

		intList.add(new Tripel<>(0, 0, 1));
		intList.add(new Tripel<>(0, 0, 2));

		Collections.sort(intList,
				new TripelComparator<Tripel<Integer, Integer, Integer>, Integer, Integer, Integer>(2));
		assertEquals("[200, 100, 020, 010, 002, 001]", intList.toString());
	}

	// v ascending, u ascending, w ascending
	@Test
	void sortTripel3() {
		var intList = new ArrayList<Tripel<Integer, String, Integer>>();

		intList.add(new Tripel<>(0, "b", 0));
		intList.add(new Tripel<>(0, "a", 0));

		intList.add(new Tripel<>(2, "x", 0));
		intList.add(new Tripel<>(1, "x", 0));

		intList.add(new Tripel<>(0, "x", 2));
		intList.add(new Tripel<>(0, "x", 1));

		Collections.sort(intList, new TripelComparator<Tripel<Integer, String, Integer>, Integer, String, Integer>(3));
		assertEquals("[0a0, 0b0, 0x1, 0x2, 1x0, 2x0]", intList.toString());
	}

	// v descending, u descending, w descending
	@Test
	void sortTripel4() {
		var intList = new ArrayList<Tripel<Integer, String, Double>>();

		intList.add(new Tripel<>(0, "a", 0.0));
		intList.add(new Tripel<>(0, "b", 0.0));

		intList.add(new Tripel<>(1, "x", 0.0));
		intList.add(new Tripel<>(2, "x", 0.0));

		intList.add(new Tripel<>(0, "x", 1.5));
		intList.add(new Tripel<>(0, "x", 2.5));

		Collections.sort(intList, new TripelComparator<Tripel<Integer, String, Double>, Integer, String, Double>(4));
		assertEquals("[2x0.0, 1x0.0, 0x2.5, 0x1.5, 0b0.0, 0a0.0]", intList.toString());
	}

	// w ascending, v ascending, u ascending
	@Test
	void sortTripel5() {
		var intList = new ArrayList<Tripel<Boolean, String, Integer>>();

		intList.add(new Tripel<>(true, "x", 2));
		intList.add(new Tripel<>(true, "x", 1));

		intList.add(new Tripel<>(true, "b", 0));
		intList.add(new Tripel<>(true, "a", 0));

		intList.add(new Tripel<>(true, "x", 0));
		intList.add(new Tripel<>(false, "x", 0));

		Collections.sort(intList, new TripelComparator<Tripel<Boolean, String, Integer>, Boolean, String, Integer>(5));
		assertEquals("[truea0, trueb0, falsex0, truex0, truex1, truex2]", intList.toString());
	}

	// w descending, v descending, u descending
	@Test
	void sortTripel6() {
		var intList = new ArrayList<Tripel<Boolean, String, Integer>>();

		intList.add(new Tripel<>(true, "x", 1));
		intList.add(new Tripel<>(true, "x", 2));

		intList.add(new Tripel<>(true, "a", 0));
		intList.add(new Tripel<>(true, "b", 0));

		intList.add(new Tripel<>(false, "x", 0));
		intList.add(new Tripel<>(true, "x", 0));

		Collections.sort(intList, new TripelComparator<Tripel<Boolean, String, Integer>, Boolean, String, Integer>(6));
		assertEquals("[truex2, truex1, truex0, falsex0, trueb0, truea0]", intList.toString());
	}

}
