import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Test039 {
    public static void main(String[] args) {
        IntConsumer consumer = e -> System.out.println(e);
        Integer value = 90;
        //a
        Function<Integer,Integer> funRef = e -> e + 10;
        //b
        //IntFunction funRef = e->e+10;
        Integer result = funRef.apply(value);
        //ToIntFunction<Integer>  funRef = e->e + 10;
        //int result = (Integer) funRef.applyAsInt(value);
        //consumer.accept(result);
        //ToIntFunction<Integer>  funRef = e->e + 10;
        //int result = (Integer) funRef.applyAsInt(value);
        consumer.accept(result);//100
    }
}
