package com.ernesto;

import java.util.Arrays;

public class Varargs {

    public static void main(String... args) {

        System.out.println("Hello World");

        String[] splitString= "Hello World Again".split(" ");

        printText(splitString);


        System.out.println("_".repeat(20));
        printText("hello");

        System.out.println("_".repeat(20));
        printText("hello", "World", "Again2");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray= {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));


    }
    
    private static void printText(String... textList){
        for (String t : textList){
            System.out.println(t);
        }
    }

}
