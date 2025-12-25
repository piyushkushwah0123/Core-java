package com.piyush;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();

		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("four");
		ts.add("one");

//		the object should be of same type , otherwise
//		will be get ClassCastException
//		ts.add(1);

//		if the specified sorted set is null
//		it throws NullPointerException	
//		ts.add(null);

//		true if this set contains no elements
		System.out.println(ts.isEmpty());

		System.out.println(ts.size());

		System.out.println(ts);
		ts.remove("three");
		System.out.println(ts);

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
