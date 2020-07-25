package section3;

public class Test {
    /**
     * Primitive types
     */
    private int ivalor=0;
    private char cvalor='A';
    private byte bvalor=127;
    private short svalor=32767;
    private long lvalor=999999;
    private float fvalor=1.0f;
    private double dvalor=2.2;
    private boolean bovalor=true;
    static int i;
    public static void main(String[] args) {

        int i, j=0, k= 10; // Line 1
        i = Test.i+k; // Line 2
        k = i+++k;  // Line 3
        //Error j no es inicializado
        Test.i = j+i; // Line 4
        System.out.println(i+" " +k);
    }
}

class Test2 {
    public static void main(String[] args) {
        boolean input1 = true, input2 = false;  // Line 1
        boolean result1 = input1 = !input1; // Line 2 input1=false, result1=false
        boolean result2 = input2 = input1;  // Line 3  input2=false , result2= false
        boolean result3 = input1 == (result1=!input2);  // Line 4 result1= true, result3=false
        System.out.println(input1+" " +input2 + " " +  result2 + " " + result3); // false false false false

        Test2 test2 = new Test2();
        test2.claseinterna();

    }
    public void claseinterna(){
        System.out.println("Calse interna 1");
        int cant1=100;
        class Valor {
            int cant=300;
            public void metodo(){
                int cant=200;
                System.out.println("Calse interna 2 "+cant+" "+this.cant+" "+cant1);
            }
        }
       // cant1++;
        Valor valor = new Valor();
        valor.metodo();
    }
}

 class Test3 {
    static String type = "this";

    public static void main(String[] args) {
        String s = (args.length > 0) ? "switch" : "";
        String caseVal = (args.length > 1) ? args[1] : "";

        if (s == "switch") {
            String type;  // Line 1
            switch (caseVal) {

                case "this":
                    type = "that";
                    break;
                case "that":
                    type = "this";
                    break;
                case "other":
                default:
                    type = "somethingelse";
            }
            if (type=="that") type="this";  //Line 2

        }
        System.out.println("this is " + type);  //Line 3
    }
}
