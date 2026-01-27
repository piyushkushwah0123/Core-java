package com.piyush.stream;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
//		List<Integer>numbers = Arrays.asList(1,2,3);
		
//		numbers.stream().map(i->i+i).forEach(i->System.out.println(i));
				
//		List<Integer>l1 = Arrays.asList(1,2,3);
//		List<Integer>l2 = Arrays.asList(4,2,5);
//		List<Integer>l3 = Arrays.asList(4,1,1);
//		List<Integer>l4 = Arrays.asList(5,3,6);
		
//		List<List<Integer>> complex = Arrays.asList(l1,l2,l3,l4);
		
//		complex.stream().map(i->i+i).forEach(i->System.out.println(i));
//		complex.stream().flatMap(i->i.stream()).map(i->i+i).forEach(i->System.out.println(i));
		
		
		 List<String>python = Arrays.asList("Piyush","Jeevan");
		 List<String>java = Arrays.asList("Ajay","Arun");
		 List<String>cp = Arrays.asList("Jatin","Lakshya");
		 
		 List<List<String>>students = Arrays.asList(python,java,cp);
		 // java 7
		 // Nested for Each
		 
		 for(List<String> x : students) {
			 for(String a : x) {
				 System.out.println(a.concat("@gmail.com"));
			 }
		 }
		 
		 // java 8
		 System.out.println(" ********************************* ");
		 
		students.stream().flatMap(i->i.stream()).map(i->i.concat("@gmail.com")).forEach(i->System.out.println(i));
		
		 
	}
}
