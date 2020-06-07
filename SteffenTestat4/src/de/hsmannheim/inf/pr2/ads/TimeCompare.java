package de.hsmannheim.inf.pr2.ads;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * This class checks the duration of the methods add() and contains() of
 * TreeSet<> and HashSet<>.
 * 
 * @author Gruppe 25: Floris (1921233), Raphael (1926543), Steffen (1923403)
 */
public class TimeCompare {

	/**
	 * Checks the runtime for TreeSet.add() for a defined number.
	 * 
	 * @param iterations number of elements to add
	 * @return runtime
	 */
	public long getDurationTreeSetAdd(int iterations) {
		var treeSet = new TreeSet<>();
		var start = System.currentTimeMillis();

		for (var i = 0; i < iterations; i++)
			treeSet.add(CreateStrings.createStrings(8));

		return (System.currentTimeMillis() - start);
	}

	/**
	 * Checks the runtime for HashSet.add() for a defined number.
	 * 
	 * @param iterations number of elements to add
	 * @return runtime
	 */
	public long getDurationHashSetAdd(int iterations) {
		var hashSet = new HashSet<>();
		var start = System.currentTimeMillis();

		for (var i = 0; i < iterations; i++)
			hashSet.add(CreateStrings.createStrings(8));

		return (System.currentTimeMillis() - start);
	}

	/**
	 * Checks the runtime for TreeSet.contains() for a defined number.
	 * 
	 * @param iterations number of elements to search for
	 * @return runtime
	 */
	public long getDurationTreeSetContains(int iterations) {
		var treeSet = new TreeSet<>();
		for (var i = 0; i < 2 * iterations; i++)
			treeSet.add(CreateStrings.createStrings(8));

		var toSearchFor = new String[iterations];
		for (var i = 0; i < toSearchFor.length; i++)
			toSearchFor[i] = CreateStrings.createStrings(8);

		var start = System.currentTimeMillis();
		for (var i = 0; i < iterations; i++)
			treeSet.contains(toSearchFor[i]);

		return (System.currentTimeMillis() - start);
	}

	/**
	 * Checks the runtime for HashSet.contains() for a defined number.
	 * 
	 * @param iterations number of elements to search for
	 * @return runtime
	 */
	public long getDurationHashSetContains(int iterations) {
		var hashSet = new HashSet<>();
		for (var i = 0; i < 2 * iterations; i++)
			hashSet.add(CreateStrings.createStrings(8));

		var toSearchFor = new String[iterations];
		for (var i = 0; i < toSearchFor.length; i++)
			toSearchFor[i] = CreateStrings.createStrings(8);

		var start = System.currentTimeMillis();
		for (var i = 0; i < iterations; i++)
			hashSet.contains(toSearchFor[i]);

		return (System.currentTimeMillis() - start);
	}

	public static void main(String[] args) {
		var tc = new TimeCompare();

		System.out.println("TreeSet.add");
		System.out.println(tc.getDurationTreeSetAdd(100));
		System.out.println(tc.getDurationTreeSetAdd(1000));
		System.out.println(tc.getDurationTreeSetAdd(10000));
		System.out.println(tc.getDurationTreeSetAdd(100000));
		System.out.println(tc.getDurationTreeSetAdd(1000000));
		System.out.println("HashSet.add");
		System.out.println(tc.getDurationHashSetAdd(100));
		System.out.println(tc.getDurationHashSetAdd(1000));
		System.out.println(tc.getDurationHashSetAdd(10000));
		System.out.println(tc.getDurationHashSetAdd(100000));
		System.out.println(tc.getDurationHashSetAdd(1000000));
		System.out.println("TreeSet.contains");
		System.out.println(tc.getDurationTreeSetContains(100));
		System.out.println(tc.getDurationTreeSetContains(1000));
		System.out.println(tc.getDurationTreeSetContains(10000));
		System.out.println(tc.getDurationTreeSetContains(100000));
		System.out.println(tc.getDurationTreeSetContains(1000000));
		System.out.println("HashSet.contains");
		System.out.println(tc.getDurationHashSetContains(100));
		System.out.println(tc.getDurationHashSetContains(1000));
		System.out.println(tc.getDurationHashSetContains(10000));
		System.out.println(tc.getDurationHashSetContains(100000));
		System.out.println(tc.getDurationHashSetContains(1000000));
	}
}
