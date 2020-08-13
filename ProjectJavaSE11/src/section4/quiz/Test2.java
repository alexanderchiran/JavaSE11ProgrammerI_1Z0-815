package section4.quiz;

/**
 *Java SE 11Programmer I_1Z0-815
 *Paulo Alexander Chiran Portillo
 *paulo.alexander12@gmial.com
 */
public class Test2 {
        static int testVariable;

        public static void main(String[] args) {
            byte i, j;
            for (i = 100, j = 0; i <= 300; i += 10, j++) { // Line 1

                testVariable = i % 50;   //  Line 2
                System.out.print(" i: "+i+ ", "); // Line 3
                if(j>100){
                    break;
                }
            }
            System.out.println(j);
            int ban=0;
            for (i = 0, j = 0; i <= 400; i ++, ban++) { // Line 1

                testVariable = i % 50;   //  Line 2
                System.out.print(i + ", "); // Line 3
                if(ban>400){
                    break;
                }
            }
            System.out.println(1);
        }

}

class Test3 {
    static int testVariable;

    public static void main(String[] args) {
        //for (int i = 0; i++ < 10; i-- ; i += 1){

        for (int i = 0; i++ < 10; i--, i += 1){

            System.out.print(i++ + ",");
        }
    }
}
