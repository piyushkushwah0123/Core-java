package com.piyush.queue;

// Duplicates are allowed
// Insertion order is preserved
// Rare-end and front-end possible 
import java.util.ArrayDeque;

public class ArrayDequeDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque ad= new ArrayDeque();
		
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		
		System.out.println(ad);
		
		 // Inserts the element at the front of the deque
        ad.addFirst(50);
        System.out.println(ad);

        // Inserts the element at the end of the deque
        ad.addLast(60);
        System.out.println(ad);
        
        // Checks whether the deque is empty
        System.out.println(ad.isEmpty());

        // Returns the total number of elements in deque
        System.out.println(ad.size());

        // peek(): Retrieves the first element without removing it
        System.out.println(ad.peek());

        // Retrieves the first element without removing it
        System.out.println(ad.peekFirst());

        // Retrieves the last element without removing it
        System.out.println(ad.peekLast());

        // Retrieves and removes the first element, returns null if empty
        System.out.println(ad.poll());
        System.out.println(ad);
        
        // Retrieves and removes the first element
        System.out.println(ad.pollFirst());
        System.out.println(ad);

        // Retrieves and removes the last element
        System.out.println(ad.pollLast());
        System.out.println(ad);

        // Inserts the element at the front (stack operation)
        ad.push(99);
        System.out.println(ad);

        // Removes and returns the first element (stack operation)
        System.out.println(ad.pop());
        System.out.println(ad);

        // Removes and returns the first element
        ad.remove();
        System.out.println(ad);

	}

}
