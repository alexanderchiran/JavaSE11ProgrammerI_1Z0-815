package SimulationTest.exam5;

/**
 * https://www.baeldung.com/java-static-default-methods
 */
public class Test6 {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
    }
}
interface Vehicle {

    String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}

interface Truck {

    String getBrand();
    String speedUp();
    String slowDown();
//    default String turnAlarmOn() {
//        return "Turning the vehicle alarm on.";
//    }
//    default String turnAlarmOff() {
//        return "Turning the vehicle alarm off.";
//    }
}

class Car implements Vehicle, Truck{
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}

class Test6A {
    private static void div() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            div();
        } finally {
            System.out.println("FINALLY");
        }
    }
}