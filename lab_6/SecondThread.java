package lab_6;

public class SecondThread extends Thread {
    public SecondThread() {
        setName("Thread2");
    }

    @Override
    public void run() {
        for (int i = 21; i <= 60; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}