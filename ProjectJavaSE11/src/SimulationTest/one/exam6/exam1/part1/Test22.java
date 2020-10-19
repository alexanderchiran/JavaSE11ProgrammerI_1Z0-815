package SimulationTest.one.exam6.exam1.part1;

import java.io.FileWriter;
import java.io.IOException;

/*
Which of the following is a checked Exception?
1. ExceptionInInitializerError
2. FileNotFoundException
3. ClassCastException
4. RuntimeException
 */
public class Test22 {
    public static void main(String[] args) {
        Test22 test22 = new Test22();
        test22.createFile("","");
    }
    public void createFile(String path, String text)  {
        FileWriter writer = null;
        try {
            writer = new FileWriter(path, true);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void setAge(int age) {
        if (age < 1 || age > 99) {
            throw new IllegalArgumentException("Invalid age");
        }
        int newAge = age;
    }
}
/*
3. List of Common Checked Exceptions in Java
Common checked exceptions defined in the java.lang package:
ReflectiveOperationException
ClassNotFoundException
InstantiationException
IllegalAccessException
InvocationTargetException
NoSuchFieldException
NoSuchMethodException
CloneNotSupportedException
InterruptedException

Common checked exceptions defined in the java.io package:
IOException
EOFException
FileNotFoundException
InterruptedIOException
UnsupportedEncodingException
UTFDataFormatException
ObjectStreamException
InvalidClassException
InvalidObjectException
NotSerializableException
StreamCorruptedException
WriteAbortedException

Common checked exceptions defined in the java.net package (almost are subtypes of IOException):
SocketException
BindException
ConnectException
HttpRetryException
MalformedURLException
ProtocolException
UnknownHostException
UnknownServiceException

Common checked exceptions defined in the java.sql package:
SQLException
BatchUpdateException
SQLClientInfoException
SQLNonTransientException
SQLDataException
SQLFeatureNotSupportedException
SQLIntegrityConstraintViolationException
SQLSyntaxErrorException
SQLTransientException
SQLTimeoutException
SQLTransactionRollbackException
SQLTransientConnectionException
SQLRecoverableException
SQLWarning

4. List of Common Unchecked Exceptions in Java
Common unchecked exceptions in the java.lang package:
ArithmeticException
IndexOutOfBoundsException
ArrayIndexOutOfBoundsException
StringIndexOutOfBoundsException
ArrayStoreException
ClassCastException
EnumConstantNotPresentException
IllegalArgumentException
IllegalThreadStateException
NumberFormatException
IllegalMonitorStateException
IllegalStateException
NegativeArraySizeException
NullPointerException
SecurityException
TypeNotPresentException
UnsupportedOperationException

Common unchecked exceptions in the java.util package:
ConcurrentModificationException
EmptyStackException
NoSuchElementException
InputMismatchException
MissingResourceException
 */
