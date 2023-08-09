package com.ernesto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxingAndUnboxing {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        System.out.println(boxedInt);

        int boxedInt1 = new Integer(20); //deprecated since JDK 9
        System.out.println(boxedInt1);

        Integer boxerInteger = 15;

        int unboxedInt = boxedInt.intValue(); // unnesessary
        System.out.println(unboxedInt);

        Integer boxedInteger = 20;
        int unboxedInteger = boxedInt;

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;

        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'A', 'B', 'C', 'D'};
        System.out.println(Arrays.toString(characterArray));

        var x=getList(1,2,3,4,5,6);
        System.out.println(x);

        var y= List.of(1, 2, 3, 4, 5, 6);
        System.out.println(x);

    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }

    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int j : varargs) {
            aList.add(j);
        }
        return aList;
    }


}
