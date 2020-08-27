package section10.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ListaReplaceAll {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(alphabets);
        alphabets.replaceAll( e -> e.toLowerCase() );
        System.out.println(alphabets);
        //-----------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------");
        ArrayList<String> alphabets1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(alphabets1);
        Consumer<String> aWords = e -> { e.toLowerCase(); };
        aWords.accept("Ana");
        alphabets1.replaceAll( e -> e.toLowerCase() );
        System.out.println(alphabets1);
    }
}

class ListaReplaceAll1
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(alphabets);
        alphabets.replaceAll( new MyOperator() );
        System.out.println(alphabets);
    }
}

class MyOperator implements UnaryOperator<String>
{
    @Override
    public String apply(String t) {
        return t.toLowerCase()+"_";
    }
}
