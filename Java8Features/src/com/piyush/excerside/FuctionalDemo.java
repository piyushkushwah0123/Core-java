package com.piyush.excerside;

import java.util.function.Function;

// Write a program to convert the String in Upper case
// Without Lamda Expression
//public class FuctionalDemo implements Function<String, String>{
//	
//	public String apply(String s) {
//		return s.toUpperCase();
//	}
//	
//	public static void main(String[] args) {
//		Function<String, String> ConvertToUpperCase = new FuctionalDemo();
//		System.out.println(ConvertToUpperCase.apply("piyush"));
//	}
//}

// With Lamda Expression
//public class FuctionalDemo{
//	public static void main(String[] args) {
//		
//		String names[] = { "ajay","arun","hasrh","piyush","jatin","vivek","shubham"};
//		
//		Function<String, String> ConvertToUpperCase = s -> s.toUpperCase();
//		
//		for (String ss : names) {
//			System.out.println(ConvertToUpperCase.apply(ss));
//		}
//	}
//}


// Remove Spaces

//public class FuctionalDemo{
//	public static void main(String[] args) {
//		
//		Function<String, String> ConvertToUpperCase = s -> s.toUpperCase();
//		Function<String,String>f1 =s1->s1.replaceAll(" ","");
//		
//		System.out.println(f1.apply("java programming language"));
//		
//	}
//}


// Count Spaces
// length with Spaces - length without Spaces
public class FuctionalDemo{
	
	public static void main(String[] args) {
		
		
		String s ="java programming language  ";
		Function<String, Integer>f1 =s1->s1.length()-s1.replaceAll(" ","").length();
		System.out.println(f1.apply(s));
	}
}













