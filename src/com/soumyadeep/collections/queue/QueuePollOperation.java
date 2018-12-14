package com.soumyadeep.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePollOperation {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
