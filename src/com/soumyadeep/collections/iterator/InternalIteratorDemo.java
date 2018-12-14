package com.soumyadeep.collections.iterator;

import java.util.LinkedList;
import java.util.List;

public class InternalIteratorDemo {

	public static void main(String[] args) {

		List<String> names = new LinkedList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");

		for (String name : names) {
			System.out.println(name);
		}

		/*
		 * we have Not created Iterator object externally. We are using Enhanced for
		 * loop to retrieve the List object elements one by one.
		 * 
		 * Enhanced for loop uses Iterator object internally and do the same thing like
		 * External Iterator example
		 */
	}

}
