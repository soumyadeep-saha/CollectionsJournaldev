package com.soumyadeep.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRemoveOperation {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());

		// Exception in thread "main" java.util.NoSuchElementException

		/*
		 * Queue.remove(element) is used to delete a specified element from the queue.
		 * If it performs delete operation successfully, it returns “true” value.
		 * Otherwise it returns “false” value.
		 */
	}

}
