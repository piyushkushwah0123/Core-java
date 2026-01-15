package com.piyushh;

// Thread life cycle :- New , Runnable, Running, Blocked, Dead  
class MyThread implements Runnable {
	public void run () {
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(2000);  // Checked Exception
				System.out.println("i-------->"+i);
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Current Thread ::" + Thread.currentThread());
		}
		
}

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		MyThread mt1 = new MyThread();
		
		Thread t1 = new Thread(mt1);
		t1.start();
		t1.setName("Thread-1");
		t1.setPriority(Thread.NORM_PRIORITY);

		
		
	}

}
