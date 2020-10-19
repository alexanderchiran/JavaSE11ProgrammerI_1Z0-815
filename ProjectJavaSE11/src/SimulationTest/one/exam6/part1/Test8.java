package SimulationTest.one.exam6.part1;

class Student {
    String name;
    int age;
    boolean result;
    double height;

    public Student() {
    }

    public Student(String name, int age, boolean result, double height) {
        this.name = name;
        this.age = age;
        this.result = result;
        this.height = height;
    }
}

public class Test8 {
    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println(stud.name + stud.height + stud.result + stud.age);
    }
}
