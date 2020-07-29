import java.util.concurrent.*;


public class Test037 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
    /*    ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new Caller("Call"));
        Future f2 = es.submit(new Runner("Run"));
        String str1 = (String) f1.get();
        String str2 = (String) f2.get();//line n1
        System.out.println(str1 + " : " + str2);*/
        ExecutorService es = Executors.newFixedThreadPool(2);
        Runnable r1= new Runner();
        Callable c1 = new Caller();
        es.submit(r1);
        Future<String>f1=es.submit(c1);
       Future<String>f2= (Future<String>) es.submit(r1);
//        es.execute(c1);
//        Future<String>f1=es.execute(c1);
        System.out.println(f1);
        es.shutdown();
    }
}

class Caller implements Callable<String> {

    String str;

    public Caller(String s) {
        this.str = s;
    }

    public Caller() {

    }

    public String call() throws Exception {
        return str.concat(" Caller");
    }
}

class Runner implements Runnable {

    String str;

    public Runner(String s) {
        this.str = s;
    }

    public Runner() {

    }

    public void run() {
        System.out.println(str.concat(" Runner"));
    }
}
