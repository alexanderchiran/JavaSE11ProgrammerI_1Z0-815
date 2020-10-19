package SimulationTest.one.exam6.exam2.part1;

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student() {
        //Student("James", 25);
    }

    Student(String name) {
        this.name = name;

    }
}

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}

class Test008 {
    public static void main(String[] args) {
        m1(null);
    }

    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }
}