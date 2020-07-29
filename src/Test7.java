import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Test7 {
    public static void main(String[] args) {
        Stream.of("Joe", "Paul", "Alice", "Tom").filter(s -> s.contains("a")).peek(s -> System.out.println("peek" + s)).findAny();
    }
}

