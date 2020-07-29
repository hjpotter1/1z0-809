import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test020 {
    public static void main(String[] args) {
/*        List<Person> sts = Arrays.asList(
                new Person("Jack", 30),
                new Person ("Mike Hill", 21),
                new Person ("Thomas Hill", 24)) ;
        Stream<Person> resList = sts.stream().filter(s -> s.getAge() >= 25) ;
        long count = resList. filter(s -> s.getName (). contains ("Hill")) .count() ;
        System.out.println(count);*/
        List<Person> sts = Arrays.asList(
                new Person("Jack", 2000),
                new Person ("Jill", 1000),
                new Person ("Thomas Hill", 24)) ;
        double val = sts.stream().filter(s->s.getName().startsWith("J")).mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(val);
    }
}
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}



