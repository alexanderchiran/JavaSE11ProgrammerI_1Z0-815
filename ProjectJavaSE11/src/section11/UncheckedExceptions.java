package section11;

/**
 * https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/
 * Unchecked are the exceptions that are not checked at compiled time. In C++, all exceptions are unchecked, so it is
 * not forced by the compiler to either handle or specify the exception. It is up to the programmers to be civilized, and specify or catch the exceptions.
 * In Java exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked.
 */
public class UncheckedExceptions {
    public static void main(String args[]) {
        int x = 0;
        int y = 10;
        int z = y/x;
    }
}
