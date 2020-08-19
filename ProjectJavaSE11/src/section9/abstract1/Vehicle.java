package section9.abstract1;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Abstract classes
*/

// Vehicle is our most general entity and will never be an
// actual instance.
public abstract class Vehicle {

    // We create an enum which describes possible subclasses
    protected enum VehicleType {
        Automobile, Motorcycle, Moped, Bicycle, Scooter
    }

    // We define some attributes all vehicles would have in common
    private VehicleType type;
    private String owner;
    private String make;

    // Constructor will be the method we use to set data
    public Vehicle(VehicleType type, String owner, String make) {
        this.type = type;
        this.owner = owner;
        this.make = make;
    }

    // We use IntelliJ's generated toString method
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", owner='" + owner + '\'' +
                ", make='" + make + '\'' +
                '}';
    }

    // We create methods we want concrete subclasses to be forced to
    // implement
    public abstract void drive();

    public abstract void park();

    public abstract void makeNoise();
}