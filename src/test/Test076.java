package test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Test076 {
    public static void main(String[] args) {

        Map<Integer,Integer> mVal = new HashMap<>();
        mVal.put(1,10);
        mVal.put(2,20);
        //BiConsumer<Integer,Integer> c //right
        BiFunction<Integer,Integer,String>c = (i,j)->{//wrong BiFunction not have accept()
            System.out.println(i +"," +j+";");
            return null;
        };
        c.apply(1,2);
        //mVal.forEach(c);
    }
}
