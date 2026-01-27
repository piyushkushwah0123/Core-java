package com.piyush.excerside;

import java.util.Collection;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

// Predicate       -------> boolean test(T t);
// Bi-Predicate    -------> boolean test(T t, U u);
// Consumer        -------> void accept(T t);
// Bi-Consumer     -------> void accept(T t, U u);
// Function        -------> R apply(T t);
// Bi-function(T,U,R)-----> R apply(T t, U u);
// Supplier        -------> T get();

public class BiPredicateDemo implements BiPredicate<String, String> {

	public boolean test(String t, String u) {
		if (t.equals(u)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		BiPredicate<String, String> ref = new BiPredicateDemo();
		System.out.println(ref.test("piyush", "piyush"));
		
	}

}
