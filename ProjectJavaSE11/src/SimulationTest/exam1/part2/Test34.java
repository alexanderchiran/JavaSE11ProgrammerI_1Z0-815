package SimulationTest.exam1.part2;
/*
Given code:
And below options:

1. int n = 0; n < arr.length; n += 1  = ok
2. int n = 0; n <= arr.length; n += 1 = ok
3. int n = 1; n < arr.length; n += 2  = ok
4. int n = 1; n <= arr.length; n += 2 = ok
How many above options can be used to replace INSERT, such that on execution, code will print NET on to the console?
 */
public class Test34 {
    public static void main(String[] args) {
        String [] arr = {"I", "N", "S", "E", "R", "T"};
        //for(/*INSERT*/) {
        for(int n = 1; n <= arr.length; n += 2) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.print(arr[n]); //Line n1
        }
    }
}
