package test;

public class Test157 {
    public static void main(String[] args) {
        ProductCode <Number, Integer> c1 = new ProductCode <Number, Integer>();

        ProductCode <Number, Long> c2 = new ProductCode <Number, Long> () ;
    }
}
 class ProductCode<T,S extends T>{
     T c1;
     S c2;
        }





