package SimulationTest.exam1.part2;
/*
Consider the code of Test.java file:
What will be the result of compiling and executing Test class?
 */
class Student1 {
    String name;
    int age;

    void Student() {
        Student("James", 25);
    }

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test45 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        System.out.println(s.name + ":" + s.age);
    }
}
