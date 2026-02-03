package sychronisation;

class MyTask extends Thread{
	public void run() {
		System.out.println("Running:" + Thread.currentThread().getName());
	}
}

public class Test2{
	public static void main(String[] args) {
		
		MyTask t1 = new MyTask();
		t1.setName("Worker-1");
		t1.start();
	}
	
}




//class MyTask implements Runnable{
//	
//	public void run() {
//		System.out.println("Running:" + Thread.currentThread().getName());
//	}
//	
//}
//
//public class Test2 {
//	public static void main(String[] args) {
//		
//		Thread t1 = new Thread(new MyTask(),"Worker-1");
//		t1.start();
//	}
//
//}
