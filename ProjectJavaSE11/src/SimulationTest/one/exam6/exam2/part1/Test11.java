package SimulationTest.one.exam6.exam2.part1;
/*
What will be the result of compiling and executing Test class?

class Vehicle {
     public int getRegistrationNumber() {
         return 1;
     }
}

class Car {
     public int getRegistrationNumber() {
         return 2;
     }
}

public class Test {
     public static void main(String[] args) {
         Vehicle obj = new Car();
         System.out.println(obj.getRegistrationNumber());
     }
}
 */
    class Vehicle {
        public int getRegistrationNumber() {
            return 1;
        }
    }

    class Car {
        public int getRegistrationNumber() {
            return 2;
        }
    }

    public class Test11 {
        public static void main(String[] args) {
            //Error
            //Vehicle obj = new Car();
            Vehicle obj = new Vehicle();
            System.out.println(obj.getRegistrationNumber());
        }
    }

