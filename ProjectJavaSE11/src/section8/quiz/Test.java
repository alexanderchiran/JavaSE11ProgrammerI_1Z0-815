package section8.quiz;

import section8.quiz.pkga.SuperClass;
/**
 * Java SE 11 Programmer 1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class Test extends SuperClass {  // Line 1
    private String text;   // Line 2
    //error porque la super clase necesita un default constructor
    //Correct Answer: here is an implied call to super() but that call fails because the no args constructor of the super
    // class(on SuperClass) has no modifier, which means it is package by default. The class Test cannot access the constructor
    // because it is not in the same package, even though it extends SuperClass. Changing the modifier of the no args constructor
    // on SuperClass to protected (or public) would make the code work and the output would be: hello.
    Test(String text) {   //Line 3
        setText(text);
    }

    //  Test(){}

    public void setText(String text) {
        this.text = text;
    }

    public static void main(String[] args) {
        System.out.println(new Test("text"));  // Line 4

    }
}