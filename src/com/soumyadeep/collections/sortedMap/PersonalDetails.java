package com.soumyadeep.collections.sortedMap;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PersonalDetails {

	String occupation;
	LocalDate dataOfBirth;
	String city;

	public PersonalDetails(String occupation, LocalDate dataOfBirth, String city) {
		this.occupation = occupation;
		this.dataOfBirth = dataOfBirth;
		this.city = city;
	}

	@Override
	public String toString() {
		return this.occupation + ", from " + this.city;
	}

	public static void main(String[] args) {
		SortedMap<String, PersonalDetails> personMap1 = new TreeMap<>();
		personMap1.put("Dan Brown", new PersonalDetails("Writer", LocalDate.of(1964, 6, 22), "New Hampshire"));
		personMap1.put("Ayn Rand", new PersonalDetails("Writer", LocalDate.of(1905, 2, 2), "Saint Petersburg"));
		personMap1.put("Devdutt Pattanaik", new PersonalDetails("Mythologist", LocalDate.of(1970, 12, 11), "Mumbai"));

		personMap1.keySet().forEach(key -> {
			System.out.println(key + " -> " + personMap1.get(key));
		});
		
		//to sort the keys as per key lengths in their descending order
		SortedMap<String, PersonalDetails> personMap2 = new TreeMap<>((s1, s2) -> s2.length() - s1.length());
		personMap2.put("Dan Brown", new PersonalDetails("Writer", LocalDate.of(1964, 6, 22), "New Hampshire"));
		personMap2.put("Ayn Rand", new PersonalDetails("Writer", LocalDate.of(1905, 2, 2), "Saint Petersburg"));
		personMap2.put("Devdutt Pattanaik", new PersonalDetails("Mythologist", LocalDate.of(1970, 12, 11), "Mumbai"));
		personMap2.keySet().forEach(key -> {
			System.out.println(key + " -> " + personMap2.get(key));
		});
		
		//create a sorted map by passing another map object or a different sorted map
		Map<String, PersonalDetails> map = new HashMap<>();
		map.put("Dan Brown", 
		  new PersonalDetails("Writer", LocalDate.of(1964, 6, 22), "New Hampshire"));
		map.put("Ayn Rand",
		  new PersonalDetails("Writer", LocalDate.of(1905, 2, 2), "Saint Petersburg"));
		map.put("Devdutt Pattanaik",
		  new PersonalDetails("Mythologist", LocalDate.of(1970, 12, 11), "Mumbai"));

		SortedMap<String, PersonalDetails> sortedMap = new TreeMap<>(map);
		sortedMap.keySet().forEach(key -> {
		    System.out.println(key + " -> " + sortedMap.get(key));
		});

		System.out.println("\nSorted Map constructed using another sorted map:");
		SortedMap<String, PersonalDetails> copiedMap = new TreeMap<>(sortedMap);
		copiedMap.keySet().forEach(key -> {
		    System.out.println(key + " -> " + copiedMap.get(key));
		});
		//comparator()
		SortedMap sortedMap1 = new TreeMap(Comparator.reverseOrder());
		Comparator comparator = sortedMap.comparator();
		
		sortedMap.keySet().forEach(System.out::println);
		Collection<PersonalDetails> values = sortedMap.values();
		values.forEach(System.out::println);
		
		//there are methods available to get first key, last key and portion of the map
		System.out.println("Smallest and largest keys of the map:");
		System.out.println(sortedMap.firstKey());
		System.out.println(sortedMap.lastKey());

		System.out.println("Head map containing keys whose values are less than D.");
		SortedMap headMap = sortedMap.headMap("D");
		headMap.keySet().forEach(System.out::println);

		System.out.println("Tail map containing keys whose values are greater than or equal to D:");
		SortedMap tailMap = sortedMap.tailMap("D");
		tailMap.keySet().forEach(System.out::println);		
	}

}
