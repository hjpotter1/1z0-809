import sun.lwawt.macosx.CSystemTray;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test060 {


/*    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10,20,30);
        Function<Integer,Integer> fn =f1->f1+f1;
        Consumer<Integer> conVal = s -> System.out.println(s);
        li.stream().map(fn).forEach(conVal);
    }*/
    public static void main(String[] args) {
        Predicate<String> test1 = w ->{
            System.out.println("111");
            return w.equals("do");
        };
        //Predicate test2 = (String w) ->w.length() >3;//编译出错
    }
}
