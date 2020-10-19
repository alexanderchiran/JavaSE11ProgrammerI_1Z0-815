package SimulationTest.one.exam6.exam1.part2;
/*
What will be the result of compiling and executing Test class?
public class Test {
     public static void main(String[] args) {
         double price = 90000;
         String model;
         if(price > 100000) {
             model = "Tesla Model X";
         } else if(price <= 100000) {
             model = "Tesla Model S";
         }
           System.out.println(model);
     }
}
 */
public class Test31 {
    public static void main(String[] args) {
        double price = 90000;
        //String model;
        String model = null;
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
        //Error: Variable 'model' might not have been initialized
        System.out.println(model);
    }
}
