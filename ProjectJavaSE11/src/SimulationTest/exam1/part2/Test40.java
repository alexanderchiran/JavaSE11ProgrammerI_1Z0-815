package SimulationTest.exam1.part2;

import java.util.Arrays;

/*
Which of the following is not a valid array declaration?
int [][] arr1 = new int[8][8];   //ok
int  arr2[][] = new int[][8];    //error
int [] arr3 = new int[8];        //ok
int [] arr4 [] = new int[8][];   //ok
 */
public class Test40 {
    public static void main(String[] args) {
        int [][] arr1 = new int[8][8];
        //int  arr2[][] = new int[][8];
        int  arr2[][] = new int[8][];
        int [] arr3 = new int[8];
        int [] arr4 [] = new int[8][];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
