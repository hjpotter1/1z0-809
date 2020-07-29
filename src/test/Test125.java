package test;

import com.sun.tools.doclint.Entity;

public class Test125 {
    public static void main(String[] args) throws FuelNotAvailException, Exception {
        Vehicle v = new SolarVehicle();
        v.ride();
    }
}


class FuelNotAvailException extends Exception {
}

class Vehicle {

     void ride() throws Exception { //line n1
        System.out.println("Happy Journey!");
    }
}

class SolarVehicle extends Vehicle {

    public void ride() throws Exception { //line n2
        super.ride();
    }
}