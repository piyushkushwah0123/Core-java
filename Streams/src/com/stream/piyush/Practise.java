package com.stream.piyush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// Modified , transfer 
// Stream API --> Java 8 Existing Collection Stream API Comes into Picture    .forEach() Iterable void
// Consumer Functional interface :- Predicate , Consumer , Supplier , Function
// Anonymous Inner Class { No Name, No return type, No Modifier , But Body Exist }
// forEach , Transform [ map ] , filter 
public class Practise {
	public static void main(String[] args) {
		/*
		List<Integer>list = new ArrayList<>();
				
			list.add(23);
			list.add(12);
			list.add(4);
			list.add(90);
			list.add(45);
		*/
	// 	List<Integer> list = Arrays.asList(1,2,2,2,2,3,3,4,5,6,7,7);
		 //   Consumer<Integer>consumer = (Integer t) -> System.out.println(t);
		 //   list.forEach(consumer);
		    
		//     System.out.println(list);
			
//			Stream<Integer> streamData = list.stream();
//			Stream<Integer> sortedStream = streamData.sorted();
//			sortedStream.forEach(i-> System.out.println(i));
//			Stream<Integer>mapData=streamData.map(n->n*2);
//			mapData.forEach(i->System.out.println(i));
			
			// Method Chaining
		     
		// sorted()     
		//	list.stream().sorted().forEach(i->System.out.println(i));
		     
		// map()     
		//	list.stream().map(n->n*n).forEach(i->System.out.println(i));
		     
		// filter()     
		//	list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		     
		// filter + map()     
		//	list.stream().filter(n->n%2==0).map(n->n*n).forEach(n->System.out.println(n));
		     
		// distinct()    
      	//	list.stream().distinct().forEach(n->System.out.println(n));
		     
		// limit()    
		// list.stream().distinct().limit(5).forEach(n->System.out.println(n));
		     
		// Skip()     
		//	list.stream().skip(3).forEach(n->System.out.println(n));
		//	System.out.println(list);
			
		List<String> list = new ArrayList<>();
		list.add("Piyush");
		list.add("Piyush");
		list.add("Vansh");
		list.add("Daksh");
		list.add("Jatin");
		list.add("Vivek");
		list.add("Shubham");
		
		Set<String>setData = list.stream().collect(Collectors.toSet());
		System.out.println(setData);
				

		
		
	}

}
