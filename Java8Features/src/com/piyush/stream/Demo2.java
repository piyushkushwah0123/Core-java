package com.piyush.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		
		List<Integer>numbers = Arrays.asList(1,2,3,4,4,5);
		
		System.out.println(numbers);
		
		List<Integer>squareOfNumbers=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(squareOfNumbers);
        
     Set<Integer> squareOfNumberOfSet =  numbers.stream().map(i->i*i).collect(Collectors.toSet());
     System.out.println(squareOfNumberOfSet);
       
	}

}
