package com.piyush;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("one");
		hs.add(null);

		System.out.println(hs);
		hs.remove("three");
		System.out.println(hs);

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
