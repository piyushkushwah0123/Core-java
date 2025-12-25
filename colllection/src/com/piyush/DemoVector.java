package com.piyush;

import java.util.*;

class Mythread3 extends Thread {

	Vector<Integer> al;

	public Mythread3(Vector<Integer> al) {
		this.al = al;

	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}
	}
}

class Mythread4 extends Thread {
	Vector<Integer> al;

	public Mythread4(Vector<Integer> al) {
		this.al = al;

	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}

	}
}

public class DemoVector {

	public static void main(String[] args) throws InterruptedException {
		Vector<Integer> al = new Vector();

		Mythread3 t1 = new Mythread3(al);
		Mythread4 t2 = new Mythread4(al);
		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(al.size());
	}
}
