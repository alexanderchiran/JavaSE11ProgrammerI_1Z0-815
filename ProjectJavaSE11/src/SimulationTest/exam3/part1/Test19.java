package SimulationTest.exam3.part1;

import java.util.ArrayList;
import java.util.List;

class Stuudent {
    private String name;
    private int age;

    Stuudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Stuudent[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}

public class Test19 {
    public static void main(String[] args) {
        List<Stuudent> students = new ArrayList<>();
        students.add(new Stuudent("James", 25));
        students.add(new Stuudent("James", 27));
        students.add(new Stuudent("James", 25));
        students.add(new Stuudent("James", 25));

        students.remove(new Stuudent("James", 25));

        for(Stuudent stud : students) {
            System.out.println(stud);
        }
    }
}

class Test19A {
    List list1 = new ArrayList<String>(); //Line 5
    List<String> list2 = new ArrayList(); //Line 6
   // List<> list3 = new ArrayList<String>(); //Line 7
    List<String> list4 = new ArrayList<String>(); //Line 8
    List<String> list5 = new ArrayList<>(); //Line 9
}