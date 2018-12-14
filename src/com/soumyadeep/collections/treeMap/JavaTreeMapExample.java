package com.soumyadeep.collections.treeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();

		map.put(10, "10");
		map.put(1, "1");
		map.put(5, "5");

		System.out.println(map);

		map = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return (o1 > o2 ? -1 : (o1 == o2) ? 0 : 1);
			}
		});

		map.put(10, "10");
		map.put(1, "1");
		map.put(5, "5");
		System.out.println(map);
	}

}
