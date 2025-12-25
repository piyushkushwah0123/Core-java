package com.piyush;

import java.util.*;

class Mythread1 extends Thread{
	
	ArrayList<Integer>al;
	
	public Mythread1(ArrayList<Integer>al) {
		this.al=al;
		
	}
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			al.add(i);
		}
	}	
}
class Mythread2 extends Thread{
	ArrayList<Integer>al;
	
	public Mythread2(ArrayList<Integer>al) {
		this.al=al;
		
	}
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			al.add(i);
		}
		
	}
}

public class DemoArraylist {

	public static void main(String[] args)throws InterruptedException {
		ArrayList<Integer> al = new ArrayList();
		
		Mythread1 t1 = new Mythread1(al);
		Mythread2 t2 = new Mythread2(al);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(al.size());
	}
}
