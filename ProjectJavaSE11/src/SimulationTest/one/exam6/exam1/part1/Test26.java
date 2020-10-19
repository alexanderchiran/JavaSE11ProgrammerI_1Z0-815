package SimulationTest.one.exam6.exam1.part1;

/*
What will be the result of compiling and executing Test class?
 */
class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Test26 {
    public static void change(Message m) {
        m = new Message();
        m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
    }
}

class Test26_1 {
    public static void change(Message m) {
        m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
    }
}

