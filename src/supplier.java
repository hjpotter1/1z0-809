import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<String> supplier = String::new;
        System.out.println(supplier.get());//""
        Supplier<Emp> supplierEmp = Emp::new;
        Emp emp = supplierEmp.get();
        emp.setName("dd");
        System.out.println(emp.getName());//dd
    }
}
