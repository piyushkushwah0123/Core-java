package sychronisation;

class SomeTask{
	public synchronized static void printTheNumber(int n) {
		for(int i=1; i<=n ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class AThread extends Thread{
	@Override
	public void run() {
		SomeTask.printTheNumber(10);
	}
}
class BThread extends Thread{
	@Override
	public void run() {
		SomeTask.printTheNumber(20);
	}
}
public class Test {
	public static void main(String[] args) {
		
		AThread at1 = new AThread();
		BThread bt1 = new BThread();
		
		at1.start();
		bt1.start();	
	}
}
