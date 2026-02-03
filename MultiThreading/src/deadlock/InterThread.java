package deadlock;

class Test {
    synchronized void show() {
        try {
            System.out.println("Thread ruk gaya");
            wait();   // yahan thread rukta hai
            System.out.println("Thread wapas chalu");
        } catch (Exception e) {}
    }

    synchronized void call() {
        System.out.println("Thread ko jaga diya");
        notify(); // waiting thread ko jagaata hai
    }
}

public class InterThread {
    public static void main(String[] args) throws Exception {
        Test t = new Test();

        new Thread(() -> t.show()).start();
        Thread.sleep(2000);
        new Thread(() -> t.call()).start();
    }
}

