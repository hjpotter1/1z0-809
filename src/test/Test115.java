package test;
import java.util.concurrent.*;
import java.util.concurrent.*;
import java.util.function.Function;

public class Test115 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(new Runner());
        Future<String> f1 = es.submit(new Caller());
        System.out.println(f1.get());
        es.shutdown();
    }
}

class Caller implements Callable<String> {
    public String call() throws Exception {
        return "call";
    }
}

class Runner implements Runnable {
    public void run() {
        System.out.println( "Runner");
    }
}