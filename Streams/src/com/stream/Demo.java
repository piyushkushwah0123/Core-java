package com.stream;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
//		System.out.println(numbers);
		
//		Stream<Integer> streamOfNumbers = numbers.stream();
		
		// one time
//		streamOfNumbers.forEach(i->System.out.println(i));
		
		// second time
//		streamOfNumbers.forEach(i->System.out.println(i));
		
//		for(Integer a : numbers) {
//			if(a%2==0) {
//				System.out.println(a);
//			}
//		}
	 // Jdk 1.8
		
//		numbers.stream().filter(i-> i%2!=0).forEach(j->System.out.println(j));
		
		// Stream APIs
		
		       Function<Integer,Integer> f = i -> i*i;
		       numbers.stream().filter(i->i%2==0).map(f).forEach(j->System.out.println(j));
		           
		
		
	}
}
