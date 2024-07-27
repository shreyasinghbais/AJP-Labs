package lab_6;

public class FirstThread extends Thread {
    public FirstThread() {
        setName("Thread1");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}