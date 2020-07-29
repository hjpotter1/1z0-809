import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test050 {
    public static void main(String[] args) {
        //List<Emp> li = Arrays.asList(new Emp("Sam",2), new Emp("John", 3), new Emp("Jim", 1));
        //li.stream().map(v->v.getEAge()).sorted().forEach(System.out::println); c:1 2 3
       // li.stream().sorted((v1,v2)->Integer.compare(v1.getEAge(),v2.getEAge())).forEach(System.out::println); //d right

       // Predicate<Emp> agVal = s -> s.getEAge() > 50; //line n1
       // li = li.stream().filter(s -> s.getEAge() > 50).collect(Collectors.toList());
        //li.stream().map(Emp::getEName).forEach(System.out::println); //line n2
        //names.forEach(n -> System.out.print(n + " "));
    }
}

class Emp1 {

     String eName;
     int eAge;
    Emp1(String eN, int eA) {
        this.eName = eN;
        this.eAge = eA;
    }

    public int getEAge() {
        return eAge;
    }

    public String getEName() {
        return eName;
    }

    public String toString() {
        return eName;
    }
}
