package section3.string1;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class IsBlank {
    public static void main(String[] args){
        System.out.println("".isEmpty()); // Prints - True
        System.out.println(" ".isEmpty()); //Prints - False

        String cadena ="      ";
        boolean blank = cadena.isBlank();
        System.out.println("isBlank 1 "+blank);

        System.out.println("isBlank 2 "+"\n\r  ".isBlank());  //returns true

        System.out.println("isEmpty 2 "+"\n\r  ".isEmpty());  //returns false

        System.out.println("ABC"+ "ABC".isBlank() );          //false

        System.out.println(" ABC "+ " ABC ".isBlank() );        //false

        System.out.println("  "+ "  ".isBlank() );           //true

        System.out.println(""+ "".isBlank() );             //true
    }
}
