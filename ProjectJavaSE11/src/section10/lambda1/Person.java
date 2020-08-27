package section10.lambda1;

import java.util.ArrayList;
import java.util.List;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1.1
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class Person {
    private String givenName;
    private String surName;
    private int age;
    private String gender;
    private String eMail;
    private String phone;
    private String address;

    public Person(String givenName, String surName, int age, String gender, String eMail, String phone, String address) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static List<Person> createShortList(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ximena","Ximena",20,"D","E","F","G"));
        personList.add(new Person("Yanco","Yanco",20,"D","E","F","G"));
        personList.add(new Person("Casa","Casa",20,"D","E","F","G"));
        personList.add(new Person("Arbol","Arbol",20,"D","E","F","G"));
        return personList;
    }

    public void printName(){
        System.out.println(this.surName);
    }
}
