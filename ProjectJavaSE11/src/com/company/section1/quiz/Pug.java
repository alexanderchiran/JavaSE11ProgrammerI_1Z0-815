package com.company.section1.quiz;
import java.util.List;

public class Pug {
    public static void main(String[] args) {

        List<String> possibleNames= List.of(args);
        for (String name : possibleNames) {
            System.out.println("Maybe Pug should be called: " + name);   //  <Line 3>
        }
    }
}