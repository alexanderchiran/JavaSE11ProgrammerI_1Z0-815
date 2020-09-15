package SimulationTest.exam2.part1;

public class Test6 {
    public static void main(String[] args) {
            String [][] fruits = {{"apple", "mango"}, {"orange", "grape"}};
            /*INSERT*/
        for(String[] arr: fruits)
                for (String fruit : arr)
                    System.out.print(fruit+" ");
        System.out.println("");
        for (int i=0 ; i< fruits.length ; i++)
            for (int j=0 ; j< fruits[i].length ; j++)
                System.out.print(fruits[i][j]+" ");

    }
}

class Test6_1 {
    public static void main(String[] args) {
        final String fName = "James";
        String fName2 = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name2_1 = fName2 + "Gosling";
        String name3 = "James" + "Gosling";
        String name4 = "JamesGosling";


        System.out.println(name1 == name2);
        System.out.println(name2 == name3);


        System.out.println(name2_1 == name3);
        System.out.println(name4 == name3);
        System.out.println(name4 == name2);
        System.out.println(name4 == name1);


    }
}
