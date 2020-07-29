public class Test029 {
    public static void main(String[] args) {
        final Counter obj1 = new Counter();
        final Counter obj2 = new Counter();
        new Thread(new Runnable() {
            public void run() {
                obj1.display(obj2);
            }
            }) .start();
                new Thread(new Runnable() {
                    public void run() {
                        obj2.display(obj1);
                    }
                }) .start();
            }
        }
        class Counter extends Thread {
            int i = 10;
            public synchronized void display(Counter obj) {
                try {
                    System.out.println("sss");
                    Thread.sleep(5);
                    obj.increment(this);
                    System.out.println(i);
                } catch (InterruptedException e) {
                }
            }
            public synchronized void increment(Counter obj) {
                i++;
            }
        }