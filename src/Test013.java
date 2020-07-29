import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test013 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 8);
        System.out.println(nums.stream().max(Comparator.comparing(a -> a)).get());
        nums.forEach(System.out::println);
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("C", 21));
        people.add(new Person("T", 20));
        people.add(new Person("B", 35));
        people.add(new Person("A", 22));
       // people.sort(Comparator.comparing(Person::getName)).;
        //people.forEach(System.out::println);
    }
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString(){
            return this.name + " (" + this.age + ")";
        }

    }
}
