package com.ernesto;

import java.util.*;

public class ChallengeArrayList {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<String> sArrayList = new ArrayList<String>();


        boolean repeat = true;
        while (repeat) {
            System.out.println("""
                    Available actions: 
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                    Enter a number for which action you want to do:
                    """);

            int entry = Integer.parseInt(s.next());

            switch (entry) {
                case 0 -> {
                    sArrayList.sort(Comparator.naturalOrder());
                    System.out.println("Your final list is = " + sArrayList);
                    System.out.println("Good Bye");
                    repeat = false;
                }
                case 1 -> {
                    System.out.println("Please enter the items you want to add to the list delimited by comma");
                    String[] add = s.next().split(",");
                    for (String item : add) {
                        if (sArrayList.contains(item)) {
                            continue;
                        } else {
                            sArrayList.add(item);
                        }
                    }
                    sArrayList.sort(Comparator.naturalOrder());
                    System.out.println("Your current list is = " + sArrayList);
                }
                case 2 -> {
                    System.out.println("Please enter the items you want to remove from the list delimited by comma");
                    String[] remove = s.next().split(",");
                    for (String item : remove) {
                        if (sArrayList.contains(item)) {
                            sArrayList.remove(item);
                        } else {
                            System.out.println("The item " + item + " is not in the ArrayList");
                        }
                    }
                    sArrayList.sort(Comparator.naturalOrder());
                    System.out.println("Your current list is = " + sArrayList);
                }
                default -> System.out.println("Please enter a valid option");
            }
        }


    }

}
