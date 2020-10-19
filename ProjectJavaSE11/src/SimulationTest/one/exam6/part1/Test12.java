package SimulationTest.one.exam6.part1;

import java.util.ArrayList;
import java.util.List;

class Student1 {
    private String name;
    private int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Student1 obj) {
        if (obj instanceof Student1) {
            Student1 stud = (Student1) obj;
            if (this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}

public class Test12 {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("James", 25));
        students.add(new Student1("James", 27));
        students.add(new Student1("James", 25));
        students.add(new Student1("James", 25));

        students.remove(new Student1("James", 25));


        for (Student1 stud : students) {
            System.out.println(stud);
        }
        Student1 e1 = new Student1("Ana",20);
        Student1 e2 = new Student1("Ana",20);
        System.out.println(e1.equals(e2));
    }
}