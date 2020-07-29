package test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test093 {
    public static void main(String[] args) throws IOException {

/*        Set<Vehicle> vehicles = new TreeSet<>();
        vehicles.add(new Vehicle(10123, "Ford"));
        vehicles.add(new Vehicle(10124, "BMW"));
        System.out.println(vehicles);*/

/*        Locale c = new Locale("de","DE");
        Locale deLocale = new Locale.Builder().setLanguage("de").setRegion("DE").build();
        System.out.println(deLocale);
             System.out.println("Default language name (default): "
                              + deLocale.getDisplayLanguage());
               System.out.println("German language name (German): "
                              + deLocale.getDisplayLanguage(deLocale));
              System.out.println("German language name (French): "
                          + deLocale.getDisplayLanguage(c));*/
/*Stream<List<String>> strs = Stream.of(Arrays.asList("text1","text2"),Arrays.asList("text2","text3"));
Stream<String>bs2 = strs.filter(b->b.contains("text1")).flatMap(rs->rs.stream());
bs2.forEach(b-> System.out.println(b));*/
/*        Deque<String> queue = new ArrayDeque<>();
        queue.add("suana");
        queue.add("duana");
        queue.add("wuana");
        System.out.println(queue.pop());
        System.out.println(queue.remove());
        System.out.println(queue);*/
/*      Path file = Paths.get("/Users/gaoyunhu");
        Stream<Path> fc = Files.list(file);
        fc.forEach (s -> System.out.println(s));*/
        //Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
/*        Stream<Path> files =Files.list(Paths.get("/Users/gaoyunhu/)"))*//**//*;
                files.forEach(fName -> { //line n1
            try {
                Path aPath = fName.toAbsolutePath(); //line n2
                System.out.println(fName + ":"
                        + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });*/
    }
}

/*class Vehicle implements Comparable{
    int vno;
    String name;
    public Vehicle(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }
    public String toString() {
        return vno + ":" + name;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}*/

abstract class Shape {
    Shape() { System.out.println("Shape"); }
    protected void area() { System.out.println("Shape"); }
}

class Square extends Shape {
    int side;
    Square(int side) {
        /* insert code here */
        this.side = side;
    }
    public void area() { System.out.println("Square"); }
}
class Rectangle extends Square {
    int len, br;
    Rectangle(int x, int y) {
        super(x);
        /* insert code here */
        len = x; br = y;
    }
    public void area() { System.out.println("Rectangle"); }
}

class Computer {
    private Card sCard = new SCard();

    private abstract class Card {
    }

    private class SCard extends Card {
    }
}





