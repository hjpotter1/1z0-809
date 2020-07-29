package test;

public class Test089 {


    public static void main(String[] args) throws Exception {
/*        Moveable<Integer> animal = n -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);*/
/*        Moveable<Integer> animal = n -> n + 10;
        animal.run(100);
        animal.walk(20);*/
  /*      Moveable animal = (Integer n) -> System.out.println(n);
        animal.run(100);
        Moveable.walk(20);*/
    }
}

interface Moveable<Integer> {
    public default void walk(Integer distance) {
        System.out.println("Walking");
    }
    public void run(Integer distance);
}


