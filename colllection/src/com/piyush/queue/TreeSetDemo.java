package com.piyush.queue;

import java.util.TreeSet;

// Ceiling :- It gives the smallest value that is greater than or equal to the given number.
// Higher  :- It return nearest highest element
// Lower   :- It return lower element
// Floor   :- It gives the largest element that is less than or equal to the given value.
// TailSet :- It return set of elements greater than or equals to the given number 
// HeadSet :- It return set of elements less than the given number.

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		// Inserts elements into the TreeSet in sorted order
		ts.add(100);
		ts.add(50);
		ts.add(25);
		ts.add(125);
		ts.add(75);
		ts.add(150);
		ts.add(175);

		System.out.println(ts);
		ts.add(150);

		System.out.println(ts);

		System.out.println(ts.ceiling(50));  
		System.out.println(ts.higher(50));    

		System.out.println(ts.floor(75));     
		System.out.println(ts.lower(125));    

		System.out.println(ts.tailSet(50));    
		System.out.println(ts.headSet(100));   
		
		// Returns the smallest (first) element
	    System.out.println(ts.first());   // 25

		// Returns the largest (last) element
		System.out.println(ts.last());    // 175

		// Removes and returns the first (smallest) element
		System.out.println(ts.pollFirst()); // 25
		System.out.println(ts);

		// Removes and returns the last (largest) element
		System.out.println(ts.pollLast());  // 175
		System.out.println(ts);

		// Checks if an element exists in the set
		System.out.println(ts.contains(100)); // true

		
	}
}
