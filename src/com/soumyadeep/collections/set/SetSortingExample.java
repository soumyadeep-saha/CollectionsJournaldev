package com.soumyadeep.collections.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetSortingExample {

	public static void main(String[] args) {

		Set<Integer> intsSet = new HashSet<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			intsSet.add(random.nextInt(1000));
		}
		System.out.println("Reverse Sorting: " + intsSet);

		// Approach-3
		Set<Integer> sortedSet = new TreeSet<>(intsSet);
		System.out.println("Sorted Set: " + sortedSet);
	}

}
