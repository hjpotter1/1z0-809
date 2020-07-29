import java.util.Comparator;

public class Test026 {
    public static void main(String[] args) {

    }
}
class  Person1 implements Comparable<Person1> {
    String name;
    Person1(String name){
        this.name=name;
    }
    public int compareTo(Person1 p) {
        return this.name.compareTo(p.name);
    }
}


