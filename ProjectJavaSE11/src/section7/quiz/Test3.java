package section7.quiz;

/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 *
 * Correct Answer: When you define any constructor in a class, java does not create the default no args constructor so
 * Line 2 fails, because a no args constructor does not exist. Line 4 fails to compile because the Test method that returns
 * a void return type is NOT an overloaded constructor method. Constructor methods cannot return anything. This is actually
 * just a method with the same name as the constructor which is permitted but vastly confusing.
 */
public class Test3 {
    String name;
    int age;

    Test3(String name) {
        this.name = name;
    }

    void Test3(String name, int age) { // Line 1
        this.name = name;
        this.age = age;
    }

    static public void main(String[] args) {
       // Test3 a = new Test3(); // Line 2
        Test3 a = new Test3("Paulo"); // Line 2
        Test3 b = new Test3("Mary");  // Line 3
        //Test3 c = new Test3("Mary", 25);  // Line 4
        b.Test3("Mary", 25);  // Line 5
    }
}

class Test4{
    int valor=1;
    static public void main(String[] args) {
        //Test4 test4 = new Test4();
        Test4 test4 = new Test4(5);
        System.out.println("Valor "+test4.valor);
    }

    Test4(int valor){
        this.valor=valor;
    }
}
