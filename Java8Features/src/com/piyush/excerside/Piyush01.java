package com.piyush.excerside;

import java.util.function.Predicate;

// write a program accept String type of content and check 
// length 7> true
// false

//public class Piyushh implements Predicate<String> {
//	@Override
//	public boolean test(String t) {
//
//		if (t.length() > 7) {
//			return true;
//
//		} else {
//			return false;
//		}
//
//	}
//
//	public static void main(String[] args) {
//		
//		Predicate<String>p = new Piyushh();
//		
//		System.out.println(p.test("Piyush"));
//		System.out.println(p.test("Chandrapal"));
//
//	}
//
//}




// With using Lamda Expression
      public class Piyush01 {
    	  
    	  public static void main(String[] args) {
			
    		  Predicate<String> p = t->t.length()>7;
    		  System.out.println(p.test("Piyush"));
   			  System.out.println(p.test("Chandrapal"));
		}
    	  
      }

