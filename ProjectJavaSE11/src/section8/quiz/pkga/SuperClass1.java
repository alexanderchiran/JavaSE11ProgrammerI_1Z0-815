package section8.quiz.pkga;

/**
 * Java SE 11 Programmer 1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmial.com
 *
 */
/**
 * Correct Answer. SuperClass has no modifier which means it is package-private access.
 * This means that TestClass cannot extend it, so none of SuperClass's methods can be accessed from TestClass.
 */
//class SuperClass1 {
public class SuperClass1 {
    public void printPublicData(String data) {
        System.out.println(data);
    }
    void printPackageData(String data) {
        System.out.println(data);
    }
    protected void printProtectedData(String data) {
        System.out.println(data);
    }
    private void printPrivateData(String data) {
        System.out.println(data);
    }
}
