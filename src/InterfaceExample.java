interface Vehicle {
    void start(); // Abstract method


    // Default method (Java 8+),
    // may be overridden by subclasses
    default void stop() {
        System.out.println("Vehicle stopped.");
    }

   // Static method (Java 8+) ,
    // used for utility methods
   // cannot be overridden by subclasses
   // can be accessed with InterfaceName
    //does not depend on instance data
    static void horn() {
        System.out.println("Vehicle horn sounded.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        Vehicle.horn(); // Calling static method from interface
    }
}