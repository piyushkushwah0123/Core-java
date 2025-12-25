package com.piyush;

public class operator {
	
	    public static void main(String[] args) {
	        
	        int a = 20, b = 10;

	        // 1) Arithmetic Operators
	        System.out.println("Arithmetic Operators -------->");
	        System.out.println("a + b : " + (a + b));   
	        System.out.println("a - b : " + (a - b));   
	        System.out.println("a * b : " + (a * b));  
	        System.out.println("a / b : " + (a / b));   
	        System.out.println("a % b : " + (a % b));  

	        // 2) Assignment Operators
	        System.out.println("\n\nAssignment Operators -------->");
	        int c = 40;
	        System.out.println("c = " + c);   
	        c += 5; 
	        System.out.println("c += 5 : " + c); 
	        c -= 3; 
	        System.out.println("c -= 3 : " + c);
	        c *= 2; 
	        System.out.println("c *= 2 : " + c);
	        c /= 4; 
	        System.out.println("c /= 4 : " + c);

	        // 3) Relational Operators
	        System.out.println("\n\nRelational Operators -------->");
	        System.out.println("a == b : " + (a == b));
	        System.out.println("a != b : " + (a != b));
	        System.out.println("a > b : " + (a > b));  
	        System.out.println("a < b : " + (a < b));   
	        System.out.println("a >= b : " + (a >= b)); 
	        System.out.println("a <= b : " + (a <= b)); 

	        // 4) Logical Operators
	        System.out.println("\n\nLogical Operators -------->");
	        boolean x = true, y = false;
	        System.out.println("x && y : " + (x && y)); 
	        System.out.println("x || y : " + (x || y));
	        System.out.println("!(x || y) : " + (!(x || y)));     
	   }
}

