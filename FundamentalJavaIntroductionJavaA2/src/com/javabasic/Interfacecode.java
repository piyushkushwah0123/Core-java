package com.javabasic;

     interface I1{
    	 int a=10;
     }
     interface I2{
    	 int b=20;
     }
     interface I3 extends I1,I2{
    	 int c=30;
     }
     class A implements I3 {
    	 void m1(){
    		 System.out.println(a);
    		 System.out.println(b);
    		 System.out.println(c);
    	 }
     }

public class Interfacecode {
	
	public static void main(String[] args) {
		
		A a1=new A();
		a1.m1();
	}
	
}
