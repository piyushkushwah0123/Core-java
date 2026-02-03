package com.stream;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Piyush","Ajay","Arun","Vansh");
		
		// Filter to print name that start with A
		
		names.stream().filter(i->i.startsWith("A")).forEach(j->System.out.println(j));
		
		//map to convert all the names to Upper Case
		//Iwant to extract the names that is not starting with s And i want to convert the result to Upper case
		
		names.stream().filter(i->i.startsWith("A")).map(i->i.toUpperCase()).forEach(i->System.out.println(i));
	
		
	}

}
