package com.soumyadeep.collections.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackToList {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		List<Integer> list = new ArrayList<>();
		list.addAll(stack);
		System.out.println("Non-Empty stack : " + stack);
		System.out.println("Non-Empty List : " + list);
	}

}
