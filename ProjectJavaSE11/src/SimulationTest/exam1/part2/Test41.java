package SimulationTest.exam1.part2;

import java.util.ArrayList;
import java.util.List;
/*
Consider below code:
What will be the result of compiling and executing Test class?

 */
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
}

public class Test41 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        //this not work
        students.remove(new Student("James", 25));
        //this work
        //students.remove(students.get(0));

        for(Student stud : students) {
            System.out.println(stud);
        }
    }
}