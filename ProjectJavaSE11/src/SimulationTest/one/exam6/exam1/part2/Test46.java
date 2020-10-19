package SimulationTest.one.exam6.exam1.part2;

/*
What will be the result of compiling and executing Test class?
 */
class Student2 {
    String name;
    int marks;

    Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Test46 {
    public static void main(String[] args) {
        Student2 student = new Student2("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks);
    }

    private static void review(Student2 stud, int marks) {
        marks = marks + 10;
        stud.marks += marks;
    }
}
