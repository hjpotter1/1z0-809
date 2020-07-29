class Vehicle {

    int distance;

    Vehicle(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) {
        int timeTravel = time;
        class Car { // line n1
            int value = 0;
            public void speed() {
                value = distance / timeTravel; // line n2
                System.out.println("Velocity with new speed " + value + " kmph");
            }
        }
        new Car().speed(); // line n3
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle(100);
        v.increSpeed(60);
    }
}
