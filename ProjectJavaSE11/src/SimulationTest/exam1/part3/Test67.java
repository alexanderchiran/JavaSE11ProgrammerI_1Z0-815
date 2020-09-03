package SimulationTest.exam1.part3;
/*
Consider below code:

And the commands:
javac Guest.java

java Guest Clare Waight Keller
 */
class Message {
    static void main(String [] args) {
        System.out.println("Welcome " + args[2] + "!");
    }
}

class Test67 {
    public static void main(String [] args) {
        String[] args1 = {"s","b","c"};
        Message.main(args1);
    }
}
