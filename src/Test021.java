import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
    CyclicBarrier cb;
    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }
    public void run() {
        try {
            cb.await();
            System.out.println("Worker...");
        } catch (Exception ex) {
        }
    }
}
class Master implements Runnable { //line n1
    public void run() {
        System.out.println("Master...");
    }
}
public class Test021 {
    public static void main(String[] args) {
        Master master = new Master();
        CyclicBarrier cb = new CyclicBarrier(1, master);
        Worker worker = new Worker(cb);
        worker.start();
    }
}