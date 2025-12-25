package com.piyush;

public class demo {
	public static void arithmeticExceptionDemo() {
		int a = 10;
		int b = 0;
		int result = a / b; // This will throw ArithmeticException
		System.out.println(result);
	}

	public static void main(String[] args) {
		arithmeticExceptionDemo();
	}
}
