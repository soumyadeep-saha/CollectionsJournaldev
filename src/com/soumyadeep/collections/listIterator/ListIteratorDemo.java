package com.soumyadeep.collections.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<String> names = new LinkedList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");

		// Getting ListIterator
		ListIterator<String> namesIterator = names.listIterator();

		// Traversing elements
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}

		// Enhanced for loop creates Internal Iterator here.
		for (String name : names) {
			System.out.println(name);
		}
	}

}
