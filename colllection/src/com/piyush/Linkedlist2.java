package com.piyush;

import java.util.*;

public class Linkedlist2 {
	public static void main(String[] args) {

		LinkedList l1 = new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		System.out.println(l1);

		System.out.println(l1.add(15));
		System.out.println(l1);

		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());

		l1.addLast(99);
		System.out.println(l1);

	}

}