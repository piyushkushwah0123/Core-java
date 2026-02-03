package com.stream.piyush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		
	 	 List<Integer> list = Arrays.asList(3, 7, 10, 12, 15, 8, 20);	
	 	 List<String> list1 = Arrays.asList("java", "springboot", "microservices", "api", "backend", "sql");
	 	 
	 //Q.1 Integer list se numbers >10 filter Karo.		
	 	    List<Integer> result = list.stream().filter(n -> n > 10).collect(Collectors.toList());
            System.out.println(result);
		
	 //Q.2 Integer list ke square find karo.	
            List<Integer> squares = list.stream().map(n -> n * n).collect(Collectors.toList());
            System.out.println(squares);
	    
	 //Q.3 String list me se length > 5 wale words ko print karo.
	        
	 //Q.4 String list me se "a" se Start hone wale words.
	 //Q.5 Integer list m se negative numbers remove kro.
	 //Q.6 employee list me se salary > 50,000 filter karo.
	 //Q.7 Product list me se price < 1000 wale products.
	 //Q.8 String list ko length ke basis par map karo.
	 //Q.9 Integer list ke double value generate karo.
	 //Q.10 List ke elements par custom calculation lagao using map().	
	}

}
