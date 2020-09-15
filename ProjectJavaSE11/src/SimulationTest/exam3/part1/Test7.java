package SimulationTest.exam3.part1;
/*
Which 3 options, if used to replace INSERT, on execution will print 9 on to the console?
int [] arr = {1, 2, 3, 4, 5};
        int x = 0;
        for(INSERT) {
        x += arr[n];
        }
        System.out.println(x);
 */
public class Test7 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int x = 0;
        for(int n=1 ; n <arr.length; n+=2) {
            x += arr[n];
        }
        System.out.println(x);

        x = 0;
        for(int n=3 ; n <arr.length; n++) {
            x += arr[n];
        }
        System.out.println(x);

        x = 0;
        for(int n=0 ; n <arr.length; n++) {
            x += arr[n];
        }
        System.out.println(x);

        x = 0;
        for(int n=0 ; n <arr.length; n+=2) {
            x += arr[n];
        }
        System.out.println(x);

        x = 0;
        for(int n=1 ; n <arr.length-1; n++) {
            x += arr[n];
        }
        System.out.println(x);
    }
}
