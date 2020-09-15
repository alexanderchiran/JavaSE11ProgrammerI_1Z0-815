class Message {
    public static void main(String [] args) {
        System.out.println("Welcome " + args[0] + "!");
    }
}

public class Test {
    public static void main(String [] args) {
        Message.main(args);
    }
}