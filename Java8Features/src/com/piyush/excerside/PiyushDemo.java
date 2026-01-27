package com.piyush.excerside;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

// Collection Framework
public class PiyushDemo implements Predicate<Collection> {

	@Override
	public boolean test(Collection t) {
		if (t.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Predicate<Collection> p = new PiyushDemo();

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1000);

		System.out.println(p.test(al));
	}
}
