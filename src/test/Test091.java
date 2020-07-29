package test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Test091 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList (new Product ( "MotherBoard", 5),
                new Product (" Speaker", 20)) ;
        //products.stream ().filter (ProductFilter::isAvailable) .forEach(p -> System. out. println(p)) ;
        Path p = Paths.get("/","f.txt");
    }
}
class Product {
    String name;
    int qty;
    public String toString() {
        return name;
    }
    public Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }
    static class ProductFilter {
        public boolean isAvailable(Product p) {
            return p.qty >= 10;
        }
    }
}




