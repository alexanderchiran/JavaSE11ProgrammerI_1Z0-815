package SimulationTest.one.exam6.exam4;

public class Test6 {
    public static void main(String[] args) {
        int i = 1;
        int j = 5;
        int k = 0;
        A: while(true) {
            i++;
            B:
            while(true) {
                j--;
                C: while(true) {
                    k += i + j;
                    if(i == j){
                        break A;}
                    else if (i > j){
                        continue A;}
                    else{
                        System.out.println("NADA");
                        continue B;}
                }
            }
        }
        System.out.println(k);
    }
}
class Test601{
    public static void main(String[] args) {

       for (int j=0;j<2;j++) {
           int i=0;
           System.out.println("j: "+j);
           A:
           while (i < 10) {
               if (i > 6) {
                   System.out.println(i);
               } else if (i > 4) {
                   System.out.println(i);
                   break A;
               } else {
                   System.out.println("NADA");
               }
               i++;
           }
       }
    }
}