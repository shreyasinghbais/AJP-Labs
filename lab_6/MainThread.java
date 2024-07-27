package lab_6;

public class MainThread {
	public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();
        t2.start();

        Thread.currentThread().setName("MainThread");
        for (int i = 61; i <= 80; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
