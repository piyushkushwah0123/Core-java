package com.piyush.excerside;
import java.util.function.Predicate;
//Predicate--> Funtional interface
//java.util.fuction
public class Piyush implements Predicate<Integer> {

	// write a logic to check a number is greater than 100 or not
	// Without Using Lambda Expression
	@Override
	public boolean test(Integer t) {

		if (t > 100) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Predicate<Integer> p = new Piyush();
		System.out.println(p.test(1000));
		System.out.println(p.test(10));
		System.out.println(p.test(100));
		System.out.println(p.test(10000));
	}

}




////With Using Lamda Expression
//public class Piyush {
//
//	public static void main(String[] args) {
//		
//		Predicate<Integer> p = (t)-> (t>100);
//		System.out.println(p.test(1000));
//	    System.out.println(p.test(10));
//	    System.out.println(p.test(100));








