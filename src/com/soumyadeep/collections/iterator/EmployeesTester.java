package com.soumyadeep.collections.iterator;

public class EmployeesTester {

	public static void main(String[] args) {

		Employees emps = new Employees();
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}

}
