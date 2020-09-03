package SimulationTest.exam1.part2;

import java.time.LocalDateTime;
/*
Which of the following statement is correct?
1. Code compiles successfully but throws Runtime exception
2. It will print any int value between 1 and 60
3. code fails to compile
4. It will print any int value between 0 an 59
 */
public class Test33 {
    public static void main(String [] args) throws InterruptedException {
        int tiempo=1000;
        while (tiempo!=0) {
            LocalDateTime obj = LocalDateTime.now();
            tiempo = obj.getSecond();
            System.out.println(obj.getSecond());
            Thread.sleep(1000);
        }
    }
}
