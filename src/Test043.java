import java.util.Comparator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Test043 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3);
        //IntFunction<Integer> inFu = x -> y -> x + y; // line n1
        IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;//b
        stream.map(inFu.apply(10)).forEach(System.out::print); // line n2
        //newStream.forEach(System.out::print);
/*      IntStream stream = IntStream.of(1, 2, 3);
        IntFunction<Integer> inFu = x -> y -> x * y; // line n1
        IntStream newStream = stream.map(inFu.apply(10)); // line n2
        newStream.forEach(System.out::print);*/
    }
}

class Book implements Comparator<Book> {

    String name;
    double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }

    public String toString() {
        return name + ":" + price;
    }
}
