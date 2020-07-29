package test;

import java.util.Arrays;
import java.util.List;

public class Test163 {
    public static void main(String[] args) {
        List<Integer> pieces = Arrays.asList(3,4,5);
        pieces.stream().filter(e->e>4).
                peek(e-> System.out.println("p"+e))
                .map(n->n-1)

                .peek(n-> System.out.println("n"+n));//.count()
        //.forEach(n-> System.out.println("n"+n)); d right
    }
}
