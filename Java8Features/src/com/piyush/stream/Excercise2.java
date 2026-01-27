package com.piyush.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Intermediate Method Operation :- Whatever the method is, if that method return Stream<E> It is always called as Intermediate method.
public class Excercise2 {
	public static void main(String[] args) {
	
//		List<Integer>numbers = Arrays.asList(1,2,3,4,5,9,23,23,23,12,1,2,3,4);
		// I Want to extract the even number
		
		// numbers.stream().filter(i->2%==0).forEach(i->System.out.println(i+" ");
		
	/*	
		Stream<Integer> streamOfNumbers = numbers.stream();
		
		Stream<Integer> evenNumbers = streamOfNumbers.filter(i->i%2==0);
		
		evenNumbers.forEach(i-> System.out.println(i));
	*/
		
//    	numbers.stream().filter(i->i%2==0).map(i->i*i).forEach(i->System.out.print(i+" "));
		 
//		List<Integer>numbers = Arrays.asList(1,1,2,2,2,1,3,4,5,4,5,90,23,23,23,12,1,2,3,4);
//		
//		numbers.stream().distinct().forEach(i->System.out.println(i));
//		System.out.println();
//		
//		numbers.stream().distinct().limit(3).forEach(i->System.out.println(i + " "));
//		System.out.println();
//		
//		numbers.stream().distinct().skip(3).forEach(i->System.out.println(i + " "));
//		System.out.println();
//		
//		numbers.stream().sorted().forEach(i->System.out.println(i + " "));
//		
//		// Reverse Order
//		System.out.println();
//		
//		 numbers.stream().sorted((a,b)->-a.compareTo(b)).forEach(i->System.out.println(i + " "));
//		 
//		 long values=numbers.stream().filter(i->i%2==0).count();
//		
//		 System.out.println(values);
		
		
		List<Integer>numbers = Arrays.asList(1,1,2,2,1,3,4,2,3,4,5,90,23,23,23,12,1,2,3,4);
		List<Integer>evenNumbers = new ArrayList<Integer>();
		List<Integer>oddNumbers = new ArrayList<Integer>();
		
		evenNumbers = numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		    System.out.println(evenNumbers);
		
	    oddNumbers  =  numbers.stream().filter(i->i%2!=0).collect(Collectors.toList());  
		
	    System.out.println(oddNumbers);
}

}
