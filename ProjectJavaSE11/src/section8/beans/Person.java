package section8.beans;
/**
 * Java SE 11 Programmer 1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Encapsulation Principles to a class
Sub-Topic:
*/

// Person 'Bean'
public class Person {
    // We declare some private attributes
    private String name;
    private StringBuilder address;
    private int age;
    private boolean esAdulto;

    public boolean isEsAdulto() {
        return esAdulto;
    }

    public void setEsAdulto(boolean esAdulto) {
        this.esAdulto = esAdulto;
    }

    // We have a constructor for easy creation of Person and
    // population of its attributes
    public Person(String name, StringBuilder address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringBuilder getAddress() {
        return address;
    }

    public void setAddress(StringBuilder address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Customize toString method
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }
}