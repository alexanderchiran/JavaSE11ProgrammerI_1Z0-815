package section10.listas;

import java.util.*;

/**
 * https://www.baeldung.com/foreach-java
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
 * Java SE 11 Programmer I_1Z0-815
 * Paulo Alexander Chirán Portillo
 * paulo.alexander12@gmail.com
 *
 */
public class ListaForeach {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println("-------------- 1. --------------");
        names = List.of("Ana","Juan","Pedro","Maria");
        names.forEach(name -> System.out.println(name));
        System.out.println("-------------- 2. --------------");
        names.forEach(System.out::println);

        System.out.println("-------------- 3. --------------");
        Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry", "Steve", "James"));
        uniqueNames.forEach(System.out::println);

        System.out.println("-------------- 4. --------------");
        Queue<String> namesQueue = new ArrayDeque<>(Arrays.asList("Larry", "Steve", "James"));
        namesQueue.forEach(System.out::println);

        System.out.println("-------------- 5. --------------");
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");
        namesMap.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("-------------- 6. --------------");
        List<Persona> personas = new ArrayList();
        personas.add(new Persona("Ana","1","Pasto"));
        personas.add(new Persona("Pedro","2","Cali"));
        personas.add(new Persona("Mario","3","Pasto"));
        personas.add(new Persona("Maria","4","Bogotá"));

        personas.forEach((persona)-> System.out.println(persona.getNombre()+" "+persona.getTelefono()+" "+persona.getCiudad()));
    }
}
