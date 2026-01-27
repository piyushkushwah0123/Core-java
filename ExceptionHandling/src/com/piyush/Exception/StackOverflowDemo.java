package com.piyush.Exception;

public class StackOverflowDemo {

	static void call() {
        call();
    }

    public static void main(String[] args) {
        call();
    }
}
