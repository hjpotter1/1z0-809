package test;

import java.util.concurrent.atomic.AtomicInteger;

public class Test144 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread[] ta = {thread1, thread2, thread3};
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
    }
}
class MyThread implements Runnable {

    private static AtomicInteger count = new AtomicInteger(0);

    public void run() {
        int x = count.incrementAndGet();
        System.out.print(x + " ");
    }
}