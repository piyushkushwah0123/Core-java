package com.piyush.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		
		System.out.println(pq);
		
		        // Inserts element into the queue
				pq.offer(10);
				System.out.println(pq);

				// Returns the head (smallest element) without removing it
				System.out.println(pq.peek());

				// Returns head element
				System.out.println(pq.element());

				// Removes and returns the head (smallest element)
				System.out.println(pq.poll());
				System.out.println(pq);
				
				// Removes and returns the head element
				System.out.println(pq.remove());
				System.out.println(pq);

				// Removes a specific element from the queue
				pq.remove(75);
				System.out.println(pq);

				// Checks whether an element exists in the queue
				System.out.println(pq.contains(100));

				// Returns total number of elements
				System.out.println(pq.size());

				// Checks whether the queue is empty
				System.out.println(pq.isEmpty());
		
	}

}
