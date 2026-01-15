package com.piyushh;

class P1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread Excuting");
		System.out.println("Current Thread ::"+Thread.currentThread());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Some Problem");
		}
		System.out.println("Task completed");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		
		System.out.println("Main Thread........ ");
		P1 p1 = new P1();
		
		Thread t1 = new Thread(p1);
		t1.setName("MyThread-01");
		t1.start();
		
		Thread t2 = new Thread(p1);
		t2.setName("MyThread-02");
		t2.start();
		
		Thread t3 = new Thread(p1);
		t3.setName("MyThread-03");
		t3.start();
	}

}
