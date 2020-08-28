package section11;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
/**
 * https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-ClassBody
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class EmptyStackException1 {
    public static void main(String[] args) {
        List<Object> obj = new ArrayList<>();

        if (obj.size() == 0) {
            throw new EmptyStackException();
        }
        //return obj;
    }


}
