package com.ernesto;

import java.util.Arrays;

public class NestedArrays {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33}
        };

        int[][] array1= new int[3][3];

        int[][] array2= new int[4][4];

        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);
    }
}
