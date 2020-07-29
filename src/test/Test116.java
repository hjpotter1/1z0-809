package test;

import java.util.DoubleSummaryStatistics;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class Test116 {
    public static void main(String[] args) {
/*       Product1 p = new Product1(null);
        //double newP = p.aDouble(0);
        DoubleSupplier js1 = p.getCost();
        System.out.println(js1);*/
    }
}
 class Product1 {
    Integer cost;
     Product1(Integer cost){
        this.cost=cost;
     }
     int getCost(){
        return cost;
     }
}