package com.ernesto;

import java.util.LinkedList;
import java.util.Scanner;


record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s %d", name, distance);
    }
}


public class LinkedListChallenge {

    public static void main(String[] args) {

        LinkedList<Place> places = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);


        addPlace(places, adelaide);
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Darwin", 3972));
        addPlace(places, new Place("Melbourne", 877));
        System.out.println(places);

        places.addFirst(new Place("Sydney", 0));
        System.out.println(places);

        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter value:");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F" -> {
                    System.out.println("User wants to go forward");
                    if(!forward){
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    System.out.println("User wants to go backwards");
                    if(forward){
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "M" -> printMenu();
                case "L" -> System.out.println(places);
                default -> quitLoop = true;

            }
        }

    }

    public static void addPlace(LinkedList<Place> list, Place place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchIndex, place);
                return;
            }

            matchIndex++;
        }

        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist places
                (M)enu
                (Q)uit""");
    }

}




