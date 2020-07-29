import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test040 {
    public static void main(String[] args) {

        List<Emp> emp = Arrays.asList(
                new Emp("John", "Smith"),
                new Emp("Peter", "Sam"),
                new Emp("Thomas", "Wale"));
        List<Emp> list = emp.stream().sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName)).collect(Collectors.toList());//a
        List<Emp> listb = emp.stream()
                .sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
                .collect(Collectors.toList());//a
        list.stream().map(s->s.getfName()).forEach(System.out::print);

    }
}
class Emp {
    String fName;
    String lName;

    public Emp(String fn, String ln) {
        fName = fn;
        lName = ln;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
    private String name;

    public Emp() {

    }

    public Emp(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
