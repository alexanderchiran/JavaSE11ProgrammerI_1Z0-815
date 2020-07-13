package section1.quiz2.domain;

import section1.quiz2.Dog;

/**
 * Compila en la ruta src/com/company/section1/quiz2/ la clase Dog.class
 *javac -d out com/company/section1/quiz2/*.java
 *
 * Compila en el mismo directorio quiz2 la clase Dog.class
 *javac com/company/section1/quiz2/*.java
 *
 * jar -cf Dog.jar -C out .
 *
 * https://docs.oracle.com/javase/tutorial/deployment/jar/build.html
 * The basic format of the command for creating a JAR file is:
 *
 * jar cf jar-file input-file(s)
 * The options and arguments used in this command are:
 *
 * The c option indicates that you want to create a JAR file.
 * The f option indicates that you want the output to go to a file rather than to stdout.
 * jar-file is the name that you want the resulting JAR file to have. You can use any filename for a JAR file. By convention, JAR filenames are given a .jar extension, though this is not required.
 * The input-file(s) argument is a space-separated list of one or more files that you want to include in your JAR file. The input-file(s) argument can contain the wildcard * symbol. If any of the "input-files" are directories, the contents of those directories are added to the JAR archive recursively.
 * The c and f options can appear in either order, but there must not be any space between them.
 *
 * As an example, suppose you wanted to put audio files and gif images used by the TicTacToe demo into a JAR file, and that you wanted all the files to be on the top level, with no directory hierarchy. You could accomplish that by issuing this command from the parent directory of the images and audio directories:
 *
 * jar cf ImageAudio.jar -C images . -C audio .
 * The -C images part of this command directs the Jar tool to go to the images directory, and the . following -C images directs the Jar tool to archive all the contents of that directory. The -C audio . part of the command then does the same with the audio directory. The resulting JAR file would have this table of contents:
 *
 *
 *
 * java -cp Dog.jar com/company/section1/quiz2/domain/Pug.java
 *
 * -cp=classpath
 */
public class Pug extends Dog {
    public static void main(String[] args) {
        System.out.println("Pug Runs");
    }
}
