package com.piyush;

import java.util.Enumeration;
import java.util.Vector;

public class Vector3 {
  public static void main(String[] args) {
    Vector v1 = new Vector();
    
    v1.add(10);
    v1.add(20);
    v1.add("Piyush");
    v1.add(30);
    System.out.println(v1);
    
    Enumeration ee = v1.elements();
    while(ee.hasMoreElements()) {
      Object o = ee.nextElement();
      System.out.println(o);
    }
    
    Vector v22 = new Vector();
    v22.add(10);
    v22.add("java");
    v22.add(12.8);
    
    System.out.println(v22);   
    
    System.out.println("------------------------");
    System.out.println(v1.addAll(v22));
    System.out.println(v1);
    
    System.out.println();
    System.out.println();
    System.out.println(v1.elementAt(5));
    
    System.out.println();
    System.out.println();
    System.out.println(v1.firstElement());
    
    System.out.println();
    System.out.println();
    System.out.println(v1.hashCode());
    
    System.out.println();
    System.out.println();
    System.out.println(v22.isEmpty());
    
  }
}
