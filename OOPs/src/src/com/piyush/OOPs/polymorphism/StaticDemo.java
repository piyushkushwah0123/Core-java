package com.piyush.OOPs.polymorphism;

class A{
	static void show() {
		System.out.println("Class A");
	}
}

class B extends A{
	static void show() {
		System.out.println("Class B");
	}
	
}
public class StaticDemo {
	public static void main(String[] args) {
		
		A Obj = new B();
		Obj.show();        // Output :- Class A
		
	}

}
