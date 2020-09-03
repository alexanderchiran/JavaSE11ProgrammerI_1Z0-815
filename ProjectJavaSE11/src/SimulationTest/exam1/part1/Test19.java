package SimulationTest.exam1.part1;

/*
Currently above code causes compilation error.
Which of the options can successfully print 128:TYPE-C on to the console?
 */
class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
}

class OTG extends PenDrive {
    String type;
    String make;
    OTG(int capacity, String type) {
        /*INSERT-1*/
        super(capacity);
        this.type = type;
        /*FIN INSERT-1*/
    }
    OTG(String make) {
        /*INSERT-2*/
        super(0);
        /*Fin INSERT-2*/
        this.make = make;
    }
}

public class Test19 {
    public static void main(String[] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);
    }
}
