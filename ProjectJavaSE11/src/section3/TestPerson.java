package section3;
/**
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chiran Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class TestPerson {
    public static void main(String[] args) {

        // First we'll create a person, JOE using 2 args constructor.
        Person joe = new Person("JOE", "55");

        // Next we'll create a person, using 1 arguments
        Person deb = new Person("DEB", "85");

        // And now the noargs constructor, and using setters
        Person ann = new Person("21");
       // ann.setAge("21");
        ann.setInstanceName("ANN");

        System.out.println(joe);
        System.out.println(deb);
        System.out.println(ann);
        int j=0;
        for (;j<10;j++){
            System.out.println(""+j);
                    }
    }
}
