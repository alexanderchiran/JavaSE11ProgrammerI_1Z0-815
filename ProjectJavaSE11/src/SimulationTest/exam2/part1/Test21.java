package SimulationTest.exam2.part1;

import java.time.LocalDate;
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
        return "Student1[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student1) {
            Student1 stud = (Student1)obj;
            if(this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}

public class Test21 {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("James", 25));
        students.add(new Student1("James", 27));
        students.add(new Student1("James", 25));
        students.add(new Student1("James", 25));

        students.remove(new Student("James", 25));

        for(Student1 stud : students) {
            System.out.println(stud);
        }
    }
}

class Test21_1 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1980-03-16");
        System.out.println(date.minusYears(-5));
    }
}

class Test21_2 {
    public static void main(String [] args) {
        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String str = process(arr, 3, 8); //Line 5
        System.out.println(str);
    }

    private static String process(int [] arr, int start, int end){
        return null;
    }
}

 class Test21_3 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(27);
        list.add(27);

        list.add(new Integer(27));
        list.add(new Integer(27));

        System.out.println(list.get(0) == list.get(1));
        System.out.println(list.get(2) == list.get(3));
    }
}