package sychronisation;
// Synchronization very very important  { Restrict kar dena }
class Student implements Runnable{
	@Override
	public synchronized void run() {  // Method Level Lock  // Method Synchronization	
		try {
			System.out.println(Thread.currentThread().getName() + "classroom se bahr gya"); // Name
			Thread.sleep(3000); // Checked Exception [ Interrupted exception ]
			System.out.println(Thread.currentThread().getName() + "Notice board wale Area mai enter hua " );
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + "Notice Board par jo notice likha hua tha usko padha ");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + "Notice padhne ke baad Institue se bahr nikal gya");	
		}
		catch(InterruptedException e) {
			System.out.println("Some Problems........");
		}	
	}
}
public class Demo {
	public static void main(String[] args) {
		
		Student c = new Student();
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		
		t1.setName("Student-1");
		t2.setName("Student-2");
		t3.setName("Student-3");
		
		t1.start();
		t2.start();
		t3.start();		
	}
}

//Class Car implements Runnable{
//@Override
//public synchronized void run() {  // Method Level Lock  // Method Synchronization
//	
//	try {
//		System.out.println(Thread.currentThread().getName() + "Came in Parking Alot"); // Name
//		Thread.sleep(3000); // Checked Exception [ Interrupted exception ]

   //   synchronization(this){
//		System.out.println(Thread.currentThread().getName() + "Come for Drive the Car" );
//		Thread.sleep(3000);
//		System.out.println(Thread.currentThread().getName() + "Started to Drive the car");
//		Thread.sleep(3000);
//		System.out.println(Thread.currentThread().getName() + "Come Back And Parked the Car");
//		
//	    }
//	} catch(InterruptedException e) {
//		System.out.println("Some Problems........");
//	}
//	
//}
//
//}

//public class Demo {
//public static void main(String[] args) {
//	
//	Son c = new Son();
//	
//	Thread t1 = new Thread(c);
//	Thread t2 = new Thread(c);
//	Thread t3 = new Thread(c);
//	
//	t1.setName("Son-1");
//	t2.setName("Son-2");
//	t3.setName("Son-3");
//	
//	t1.start();
//	t2.start();
//	t3.start();
//	
//}
//
//
//}