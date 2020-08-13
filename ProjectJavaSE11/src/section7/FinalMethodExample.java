package section7;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 Section 7: Creating and Using Methods
 Topic: Create Methods and Constructors
 Sub-Topic: Final Methods
 */
// Create an abstract class with abstract methods
abstract class WillHaveManySubTypes {

    public abstract void doXYourWay();

    public abstract void doYYourWay();

    public void xyz(){
        System.out.println("xyz 1");
    }

    public abstract String toString();

    // Here we create a final method in an abstract class
    //cannot override a final method
    final void doZOnlyOneWay() {
        System.out.println("Z can only be done this way");
    }
}

public class FinalMethodExample extends WillHaveManySubTypes {
    private boolean flag = false;

    public static void main(String[] args) {

        // We instantiate an object and test all the methods
        FinalMethodExample e = new FinalMethodExample();
        e.doXYourWay();
        e.doYYourWay();
        e.doZOnlyOneWay();
        e.xyz();
        System.out.println(e);
    }

    //Override and implement the abstract class's abstract methods
    public void doXYourWay() {
        System.out.println("Implemented X my way");
    }

    public void doYYourWay() {
        System.out.println("Implemented Y my way");
    }

  // public void doZOnlyOneWay() {
  //      System.out.println("Implement Z my way");
  //  }

    public String toString() {
//        return super.toString();
        return "Not implemented yet";
    }
    //@Override
    //public void xyz(){
   //     System.out.println("123");
   // }
}
