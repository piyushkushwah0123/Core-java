package com.piyush;

import java.util.Enumeration;
import java.util.Stack;

public class Stack4 {
	
	public static void main(String []args) {
		
		Stack s = new Stack();
		
		s.add(10);
		s.add(20);
		s.add("piyush");
		s.add("kushwah");
		s.add(1233);
		s.add(5656);	
		
		Enumeration eq = s.elements();
		while(eq.hasMoreElements());{
		Object oo = eq.nextElement();
		System.out.println(oo);
	}
	
	System.out.println("----------------");
	System.out.println(s.pop());
	System.out.println(s);
	
	System.out.println("----------------");
	System.out.println(s.peek());
	System.out.println(s);
	
	System.out.println("----------------");
	System.out.println(s.push(20));
	System.out.println(s);
}
}