package com.ernesto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {

        String[] items = {"Apples", "Bananas", "Milk", "Eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        groceries.add("Yogurt");

        System.out.println(groceries.indexOf("Yogurt"));
        System.out.println(groceries.lastIndexOf("Yogurt"));

        System.out.println(groceries);
        groceries.remove(0);
        groceries.remove("Yogurt");

        System.out.println(groceries);

        groceries.removeAll(List.of("mustard", "Milk"));
        System.out.println(groceries);

        groceries.retainAll(List.of("Bananas", "cheese", "Eggs"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray= groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }

}
