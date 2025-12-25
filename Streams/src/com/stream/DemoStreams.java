package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class DemoStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 1, 13, 14, 15);

		// Filter even numbers from a list
		List<Integer> evenNum = new ArrayList<>();
		evenNum = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers");
		System.out.println(evenNum);
		System.out.println();

		// Filter odd numbers from a list
		List<Integer> Odd = new ArrayList<>();
		Odd = numbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd Numbers");
		System.out.println(Odd);
		System.out.println();

		// Remove dublicates numbers from a list
		System.out.println("Removed Dublicates Numbers");
		numbers.stream().distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println();

		// Skip numbers from a list
		System.out.println("With Skip Numbers");
		numbers.stream().distinct().skip(5).forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println();

		// Limit numbers From a list
		System.out.println("After Liimiting Numbers");
		numbers.stream().distinct().limit(7).forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println();

		// Find the max numbers from a list of Integer
		System.out.println("Max Number");
		int max = numbers.stream().max(Integer::compare).orElseThrow();
		System.out.println(max);
		System.out.println();

		// Sort a list of integer in decending order using streaming API
		System.out.println("Decending Order");
		List<Integer> sortedNumber = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedNumber);
		System.out.println();

		// Count String with specific prefix
		System.out.println("Count String");
		List<String> names = Arrays.asList("Sumit", "Piyush", "Jatin", "Shubam", "Vansh", "Sarfaroz", "Vivek");
		long Countname = names.stream().filter(i -> i.startsWith("S")).count();
		System.out.println(Countname);
		System.out.println();

		// Find first non repeating Char in String
		System.out.println("Upper Case");
		List<String> upperCaseLetter = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseLetter);
		System.out.println();

		// Sum of numbers in a list
		System.out.println("Sum of Numbers");

		// Count frequency of char in a String
		System.out.println("Count Frequency of Char");

		// Calculate average of numbers
		System.out.println("Average of numbers");

		// Reverse each String in a List
		System.out.println("Reverse String");

		// Find the most frequent character in a String
		System.out.println("Frequent Char of String");

		// Find the longest word in a sentence
		System.out.println("Longest word");

	}

}
