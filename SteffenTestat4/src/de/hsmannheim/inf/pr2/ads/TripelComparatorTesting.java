package de.hsmannheim.inf.pr2.ads;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class TripelComparatorTesting {

	// Alle drei Sortierkriterien sind abgedeckt
	// zuerst nach u aufsteigend, dann nach v aufsteigend und dann nach w
	// aufsteigend
	@Test
	void sortTripel1() {
		var intList = new ArrayList<Tripel<Integer, Integer, Integer>>();
		intList.add(new Tripel<>(1, 2, 3));
		intList.add(new Tripel<>(3, 2, 1));
		intList.add(new Tripel<>(2, 2, 2));
		intList.add(new Tripel<>(3, 1, 7));
		intList.add(new Tripel<>(2, 2, 0));
		Collections.sort(intList,
				new TripelComparator<Tripel<Integer, Integer, Integer>, Integer, Integer, Integer>(1));
		assertEquals("[123, 220, 222, 317, 321]", intList.toString());
	}

	// Alle drei Sortierkriterien sind abgedeckt
	// zuerst nach u absteigend, dann nach v absteigend und dann nach w absteigend
	@Test
	void sortTripel2() {
		var intList = new ArrayList<Tripel<Integer, Integer, Integer>>();
		intList.add(new Tripel<>(1, 2, 3));
		intList.add(new Tripel<>(3, 2, 1));
		intList.add(new Tripel<>(2, 2, 2));
		intList.add(new Tripel<>(3, 1, 7));
		intList.add(new Tripel<>(2, 2, 0));
		Collections.sort(intList,
				new TripelComparator<Tripel<Integer, Integer, Integer>, Integer, Integer, Integer>(2));
		assertEquals("[321, 317, 222, 220, 123]", intList.toString());
	}

	// Alle drei Sortierkriterien sind abgedeckt
	// zuerst nach v aufsteigend, dann nach u aufsteigend und dann nach w
	// aufsteigend
	@Test
	void sortTripel3() {
		var intList = new ArrayList<Tripel<Integer, String, Integer>>();
		intList.add(new Tripel<>(1, "e", 3));
		intList.add(new Tripel<>(3, "f", 1));
		intList.add(new Tripel<>(2, "f", 2));
		intList.add(new Tripel<>(3, "a", 7));
		intList.add(new Tripel<>(3, "a", 0));
		Collections.sort(intList, new TripelComparator<Tripel<Integer, String, Integer>, Integer, String, Integer>(3));
		assertEquals("[3a0, 3a7, 1e3, 2f2, 3f1]", intList.toString());
	}

	// Alle drei Sortierkriterien sind abgedeckt
	// zuerst nach v absteigend, dann nach u absteigend und dann nach w absteigend
	@Test
	void sortTripel4() {
		var intList = new ArrayList<Tripel<Integer, String, Double>>();
		intList.add(new Tripel<>(1, "e", 3.7));
		intList.add(new Tripel<>(3, "f", 1.2));

		intList.add(new Tripel<>(2, "f", 2.7));
		intList.add(new Tripel<>(3, "f", 7.3));

		intList.add(new Tripel<>(3, "a", 0.4));
		intList.add(new Tripel<>(3, "a", 0.9));
		Collections.sort(intList, new TripelComparator<Tripel<Integer, String, Double>, Integer, String, Double>(4));
		assertEquals("[3f7.3, 3f1.2, 2f2.7, 1e3.7, 3a0.9, 3a0.4]", intList.toString());
	}

	// Alle drei Sortierkriterien sind abgedeckt
	// zuerst nach w aufsteigend, dann nach v aufsteigend und dann nach u
	// aufsteigend
	@Test
	void sortTripel5() {
		var intList = new ArrayList<Tripel<Boolean, String, Integer>>();
		intList.add(new Tripel<>(true, "e", 3));
		intList.add(new Tripel<>(false, "f", 1));

		intList.add(new Tripel<>(false, "f", 2));
		intList.add(new Tripel<>(true, "a", 2));

		intList.add(new Tripel<>(true, "a", 0));
		intList.add(new Tripel<>(false, "a", 0));
		Collections.sort(intList, new TripelComparator<Tripel<Boolean, String, Integer>, Boolean, String, Integer>(5));

		assertEquals("[falsea0, truea0, falsef1, truea2, falsef2, truee3]", intList.toString());
	}

	// Alle drei Sortierkriterien sind abgedeckt
	// zuerst nach w absteigend, dann nach v absteigend und dann nach u absteigend
	@Test
	void sortTripel6() {
		var intList = new ArrayList<Tripel<Boolean, String, Integer>>();
		intList.add(new Tripel<>(true, "e", 1));
		intList.add(new Tripel<>(false, "f", 3));

		intList.add(new Tripel<>(false, "a", 2));
		intList.add(new Tripel<>(true, "f", 2));

		intList.add(new Tripel<>(false, "a", 0));
		intList.add(new Tripel<>(true, "a", 0));
		Collections.sort(intList, new TripelComparator<Tripel<Boolean, String, Integer>, Boolean, String, Integer>(6));
		assertEquals("[falsef3, truef2, falsea2, truee1, truea0, falsea0]", intList.toString());
	}

}
