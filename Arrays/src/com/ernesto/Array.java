package com.ernesto;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];

        myIntArray[6] = 60;

        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[0]);


        int[] firstFivePositives = new int[]{1, 2, 3, 4, 5};
        System.out.println(firstFivePositives[2]);

        int[] newArray;
//       newArray= new int[]{5,4,3,2,1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
            System.out.println(newArray[i] = i);
        }

        System.out.println();
        for (int element : newArray) {
            System.out.println(element);
        }

        System.out.println(Arrays.toString(newArray));

    }

}
