package com.piyush;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> ls = new LinkedHashSet<String>();

		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");
		ls.add("one");
		ls.add(null);
		System.out.println(ls);
		ls.remove("three");
		System.out.println(ls);

		Iterator<String> itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
