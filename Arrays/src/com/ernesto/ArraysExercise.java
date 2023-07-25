package com.ernesto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysExercise {

    public static void main(String[] args) {


    }

    public static int[] getIntegers(int size) {
        Scanner s = new Scanner(System.in);
        int[] arrayInt = new int[size];

        int counter = 0;
        while (counter < size) {
            System.out.println("Enter the next element of the array: ");
            arrayInt[counter] = Integer.parseInt(s.next());
            counter++;
        }
        return arrayInt;
    }

    public static void printArray(int[] sortedArray) {
        int counter = 0;
        for (int element : sortedArray) {
            System.out.println("Element " + counter + " contents " + element);
            counter++;
        }
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int leng= array.length;

        int[] sorted= new int[leng];

        int index= leng-1;
        for(int element: array){
            sorted[index]= element;
            index--;
        }

        return sorted;
    }


}

