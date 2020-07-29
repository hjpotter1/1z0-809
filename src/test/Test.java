package test;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws Exception {
        String dbURL="111";
        String userName="111";
        String passWord ="111";

        try  {
            Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
            String query = "SELECT id FROM Employee";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.getInt("ID");

            }
        catch (Exception e) {
            System.out.println("Error");
        }
        
        
/*        MyClass obj = null;
        try(MyClass obj1 = new MyClass()){
            obj1.test= 100;
            obj = obj1.copyObject();
        }
        System.out.println(obj.test);*/
/*        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) { // line n1
            br.lines().forEach(c -> System.out.println(c));
            brCopy = br;//line n2
        }
        brCopy.ready(); //line n3;
        List<Double> nums = Arrays.asList(10.12, 20.12);
        DoubleFunction funD = d-> d+100.0;*/
              // ResourceBundle resourceBundle=ResourceBundle.getBundle("project");
             // System.out.println(resourceBundle.getString("projectName"));
        //Integer result = (Integer) funRef.apply(value);
       // nums.stream().map(funD.apply(100.0))
       // Double result = (Double) funD.apply(10.0);//20 改成value的话是100
        //System.out.println(result);
       // DoubleStream stream = DoubleStream.of(1, 2, 3);
       // DoubleFunction<DoubleUnaryOperator> inFu = x -> y -> x * y;//b
        //DoubleStream stream1 = (DoubleStream) nums.stream().map(inFu.apply(10.0)); // line n2
        //stream1.forEach(System.out::print);
        //nums.stream().map(funD.apply(10.0)).forEach(System.out::print);
        //result.forEach(System.out::print);
        // funRef = e->e+10;
        //Integer result = (Integer) funRef.apply(10);//20 改成value的话是100
        //nums.stream().forEach(funD);

/*        BiPredicate<String, String> bp = (String s1, String s2) -> s1.contains("SG") && s2.contains("java");
        BiFunction<String, String, Integer> bf = (String s1, String s2) -> {
            int fee = 0;
            if (bp.test(s1, s2)) {
                fee = 100;
            }
            return fee;
        };
        int fee1 = bf.apply("SGf", "aa");
        System.out.println(fee1);*/

/*        USCurrency usCoin =  USCurrency.DIME;
        System.out.println(usCoin.getValue());*/
/*        Stream<List<String>> iStr = Stream.of(
                Arrays.asList("1", "John"),
                Arrays.asList("2", null));
        //IntStream nInSt = iStr.flatMapToInt((x) -> x.stream());
        //IntStream nInSt = iStr.flatMapToInt((x) -> x.stream().mapToInt(Integer::valueOf));
        IntStream nInSt = iStr.mapToInt((x) -> Integer.parseInt(x.get(0)));//正确
        nInSt.forEach(System.out::print);*/

/*        UnaryOperator<Double> uo1 = s -> s * 2; //line n1
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
                .map(lv -> uo1.apply(lv)) //line n2
                .forEach(s -> System.out.print(s + " "));*/

/*        List<String> codes = Arrays.asList("", "11","","22","33");
        Long a = codes.stream().filter(x->!x.isEmpty()).count();
        System.out.println(a);*/
/*        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1000);
        queue.push(2000);
        queue.add(3000);
        queue.push(4000);
        System.out.println(queue);
        Integer i1 = queue.remove();
        System.out.println(queue);
        Integer i2= queue.pop();
        System.out.println(queue);
        System.out.println(i1+":"+i2);*/
    }
}

interface Rideable {


}

class MyClass  implements  AutoCloseable{
    int test;
    public  void close(){
    }
    public MyClass copyObject() {
        return new MyClass();
    }
}

enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    private int value;

    private USCurrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

