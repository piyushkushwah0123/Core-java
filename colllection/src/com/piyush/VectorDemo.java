package com.piyush;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		
		v1.add(10);
		v1.add(20);
		v1.add("piyush");
		v1.add(11.12);
		System.out.println(v1);
		
		Enumeration ee = v1.elements();
	    while(ee.hasMoreElements()) {
	      Object o = ee.nextElement();
	      System.out.println(o);
	    }
		
		System.out.println();
		
		Vector v2 = new Vector();
		
		v2.add(30);
		v2.add(40);
		v2.add("kushwah");
		v2.add(22.33);
		System.out.println(v2);
		
		System.out.println();
		System.out.println();
		
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());		
		System.out.println(v1.addAll(v2));
		System.out.println(v1);
		
		System.out.println(v1.hashCode());
		
		System.out.println(v1.size());
		
		System.out.println(v1.isEmpty());
		
		System.out.println(v1.capacity());
		
		System.out.println(v1.get(2));
	    
			
	}

}
