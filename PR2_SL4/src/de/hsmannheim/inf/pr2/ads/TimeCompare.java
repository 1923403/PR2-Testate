package de.hsmannheim.inf.pr2.ads;

import java.util.HashSet;
import java.util.TreeSet;

public class TimeCompare {

	public static void main(String[] args) {

		var treeSet = new TreeSet<String>();
		var hashSet = new HashSet<String>();

		for (int i = 0; i < 10; i++)
			System.out.println(CreateStrings.createStrings(8));

//		System.out.println(getDurationTreeSetAdd(100));
//		System.out.println(getDurationTreeSetAdd(1000));
//		System.out.println(getDurationTreeSetAdd(10000));
//		System.out.println(getDurationTreeSetAdd(100000));
//		System.out.println(getDurationTreeSetAdd(1000000));
//		System.out.println(getDurationHashSetAdd(100));
//		System.out.println(getDurationHashSetAdd(1000));
//		System.out.println(getDurationHashSetAdd(10000));
//		System.out.println(getDurationHashSetAdd(100000));
//		System.out.println(getDurationHashSetAdd(1000000));
		System.out.println(getDurationTreeSetContains(100));
		System.out.println(getDurationTreeSetContains(1000));
		System.out.println(getDurationTreeSetContains(10000));
		System.out.println(getDurationTreeSetContains(100000));
		System.out.println(getDurationTreeSetContains(1000000));
	}

	static long getDurationTreeSetAdd(int n) {

		var treeSet = new TreeSet<String>();
		var start = System.currentTimeMillis();
		for (int i = 0; i < n; i++)
			treeSet.add(CreateStrings.createStrings(8));
		return (System.currentTimeMillis() - start);

	}

	static long getDurationHashSetAdd(int n) {

		var hashSet = new HashSet<String>();
		var start = System.currentTimeMillis();
		for (int i = 0; i < n; i++)
			hashSet.add(CreateStrings.createStrings(8));
		return (System.currentTimeMillis() - start);

	}

	static long getDurationTreeSetContains(int n) {

		var treeSet = new TreeSet<String>();

		for (int i = 0; i < 2 * n; i++)
			treeSet.add(CreateStrings.createStrings(8));
		var toSearchFor = new String[n];

		for (var a : toSearchFor) {
			a = CreateStrings.createStrings(8);
		}
		System.out.println(toSearchFor.toString());

		var start = System.currentTimeMillis();
		for (int i = 0; i < n; i++)
			treeSet.contains(CreateStrings.createStrings(8));
		return (System.currentTimeMillis() - start);

	}

}
