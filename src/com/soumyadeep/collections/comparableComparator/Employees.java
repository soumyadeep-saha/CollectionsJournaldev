package com.soumyadeep.collections.comparableComparator;

import java.util.Arrays;

public class Employees implements Comparable<Employees> {

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public Employees(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employees emp) {
		// let's sort the employee based on id in ascending order
		// returns a negative integer, zero, or a positive integer as this employee id
		// is less than, equal to, or greater than the specified object.
		return (this.id - emp.id);
	}

	@Override
	// this is required to print the user friendly information about the Employee
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
	}

	public static void main(String[] args) {

		Employees[] empArr = new Employees[4];
		empArr[0] = new Employees(10, "Mikey", 25, 10000);
		empArr[1] = new Employees(20, "Arun", 29, 20000);
		empArr[2] = new Employees(5, "Lisa", 35, 5000);
		empArr[3] = new Employees(1, "Pankaj", 32, 50000);

		// sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));

	}

}
