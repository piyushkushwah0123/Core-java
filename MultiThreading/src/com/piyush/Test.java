// ***********************  METHOD SYNCHRONIZATION  *********************

package com.piyush;

class MyTask implements Runnable{
	  public synchronized void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "Hello");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + "Piyush");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + "Kushwah");
			Thread.sleep(3000);	
		}
		catch(InterruptedException e) {
			System.out.println("Some Problem");
		}
	}
}
public class Test {
	public static void main(String[] args) {
		
		MyTask m1 = new MyTask();
		
		 Thread t1 = new Thread(m1, "Task-1:");
		 Thread t2 = new Thread(m1, "Task-2:");
		 Thread t3 = new Thread(m1, "Task-3:");
		 
		 t1.start();
		 t2.start();
		 t3.start();			 	 
	}
}





//  ***********************  BLOCK SYNCHRONIZATION  ***********************

//package com.piyush;
//
//class MyTask implements Runnable {
//
//    @Override
//    public void run() {
//
//        try {
//            System.out.println(Thread.currentThread().getName() + " Hello");
//            Thread.sleep(3000);

//            synchronized (this) {   
//                System.out.println(Thread.currentThread().getName() + " Piyush");
//                Thread.sleep(3000);
//                System.out.println(Thread.currentThread().getName() + " Kushwah");
//                Thread.sleep(3000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Some Problem");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//
//        MyTask m1 = new MyTask();
//
//        Thread t1 = new Thread(m1, "Task-1:");
//        Thread t2 = new Thread(m1, "Task-2:");
//        Thread t3 = new Thread(m1, "Task-3:");
//
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}






//  ************************  OBJECT SYNCHRONIZATION  ************************

//package com.piyush;
//
//class MyTask implements Runnable {
//
//    private final Object lock = new Object();
//
//    @Override
//    public void run() {
//
//        try {
//            // Non-critical section
//            System.out.println(Thread.currentThread().getName() + " Hello");
//            Thread.sleep(3000);
//    
//            synchronized (lock) {   
//                System.out.println(Thread.currentThread().getName() + " Piyush");
//                Thread.sleep(3000);
//                System.out.println(Thread.currentThread().getName() + " Kushwah");
//                Thread.sleep(3000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Some Problem");
//        }
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//
//        MyTask m1 = new MyTask();
//
//        Thread t1 = new Thread(m1, "Task-1:");
//        Thread t2 = new Thread(m1, "Task-2:");
//        Thread t3 = new Thread(m1, "Task-3:");
//
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}