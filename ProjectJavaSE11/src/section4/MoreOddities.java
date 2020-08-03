package section4;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmial.com
 *
 */
public class MoreOddities {
    public static void main(String[] args) {
        int number = 10;
        int result = 0;
        System.out.println("----------  First Test --------------");
        // result = --number - number--
        // result always resolves to zero
        // Test a couple of instances with a for loop
        int cont=0;
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = --number - number--;
            cont++;
            System.out.println(cont+". i = " + i + ", number = " + number +", result = " + result);
        }

        System.out.println("----------  Second Test --------------");
        // result = --number - number--
        // result always resolves to zero
        // Test a couple of instances with a for loop

        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = --number + number--;
            cont++;
            System.out.println(cont+". i = " + i + ", number = " + number +", result = " + result);
        }

        System.out.println("----------  Third Test --------------");
        // int result = number-- - --number;
        // result is always the number 2
        // Test with a few examples in a for loop
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = number-- + --number;
            cont++;
            System.out.println(cont+". i = " + i + ", number = " + number +
                    ", result = " + result);
        }

        System.out.println("----------  Fourth Test --------------");
        // int result = number-- + --number;
        // result is always the number 2
        // Test with a few examples in a for loop
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = number-- - --number;
            cont++;
            System.out.println(cont+". i = " + i + ", number = " + number +
                    ", result = " + result);
        }

        System.out.println("----------  Fifth   Test --------------");
        // Just complicating matters a bit more.
        for (int i = 10; i <= 20; i += 10) {
            number = i;
            result = number-- - number++ * --number;
            cont++;
            System.out.println(cont+". i = " + i + ", number = " +
                    number + ", result = " + result);
        }

        System.out.println("----------  Sixth  Test --------------");
        // (number--) == (number += 1)
        // evaluates to true!
        number = 10;
        boolean isEqual = (number--) == (number += 1);
        System.out.println("isEqual = " + isEqual +
                ", and number = " + number);

        System.out.println("----------  Final Test --------------");
        // number = number--;
        // value in number stays unchanged
        number = 10;
        number = number--;
        System.out.println("number = " + number);
    }
}
