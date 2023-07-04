public class CodingExercises {

    public static void main(String[] args) {

        System.out.println("checkNumber: ");
        checkNumber(5);
        checkNumber(-8);
        checkNumber(0);

        System.out.println();
        System.out.println("toMilesPerHour: ");
        //Examples of input/output:
        System.out.println(toMilesPerHour(1.5)); //→ should return value 1
        System.out.println(toMilesPerHour(10.25)); //→ should return value 6
        System.out.println(toMilesPerHour(-5.6)); //→ should return value -1
        System.out.println(toMilesPerHour(25.42)); //→ should return value 16
        System.out.println(toMilesPerHour(75.114)); //→ should return value 47

        System.out.println();
        System.out.println("kilometerPerHour: ");
        //Examples of input/output:
        printConversion(1.5); //→ should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
        printConversion(10.25); //→ should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
        printConversion(-5.6); //→ should print the following text (into the console - System.out): Invalid Value
        printConversion(25.42); //→ should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
        printConversion(75.114); //→ should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h

        System.out.println();
        System.out.println("printMegaBytesAndKiloBytes: ");
        //EXAMPLE INPUT/OUTPUT
        printMegaBytesAndKiloBytes(2500); //→ should print the following text: "2500 KB = 2 MB and 452 KB"
        printMegaBytesAndKiloBytes(-1024); //→ should print the following text: "Invalid Value" because parameter is less than 0.
        printMegaBytesAndKiloBytes(5000); //→ should print the following text: "5000 KB = 4 MB and 904 KB"

        System.out.println();
        System.out.println("shouldWakeUp: ");
        //Examples of input/output:
        System.out.println(shouldWakeUp(true, 1)); //→ should return true
        System.out.println(shouldWakeUp(false, 2));  //→ should return false since the dog is not barking.
        System.out.println(shouldWakeUp(true, 8));   //→ should return false, since it's not before 8.
        System.out.println(shouldWakeUp(true, -1));         //→ should return false since the hourOfDay parameter needs to be in a range 0-23.

        System.out.println();
        System.out.println("isLeapYear: ");
        //Examples of input/output:
        System.out.println(isLeapYear(-1600)); //→ should return false since the parameter is not in range (1-9999)
        System.out.println(isLeapYear(1600)); //→ should return true since 1600 is a leap year
        System.out.println(isLeapYear(2017)); //→ should return false since 2017 is not a leap year
        System.out.println(isLeapYear(2000));  //→ should return true because 2000 is a leap year

        System.out.println();
        System.out.println("areEqualByThreeDecimalPlaces: ");
        //EXAMPLES OF INPUT/OUTPUT:
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //→ should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); //→ should return false since numbers are not equal up to 3 decimal places
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); //→ should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); //→ should return false since numbers are not equal up to 3 decimal places.

        System.out.println();
        System.out.println("hasEqualSum: ");
        //EXAMPLES OF INPUT/OUTPUT:
        System.out.println(hasEqualSum(1, 1, 1));  //should return false since 1 + 1 is not equal to 1
        System.out.println(hasEqualSum(1, 1, 2));  //should return true since 1 + 1 is equal to 2
        System.out.println(hasEqualSum(1, -1, 0));  //should return true since 1 + (-1) is 1 - 1 and is equal to 0

        System.out.println();
        System.out.println("hasTeen: ");
        //EXAMPLES OF INPUT/OUTPUT:
        System.out.println(hasTeen(9, 99, 19));  //should return true since 19 is in range 13 - 19
        System.out.println(hasTeen(23, 15, 42));  //should return true since 15 is in range 13 - 19
        System.out.println(hasTeen(22, 23, 34));  //should return false since numbers 22, 23, 34 are not in range 13-19

        System.out.println();
        System.out.println("isTeen: ");
        //EXAMPLES OF INPUT/OUTPUT:
        System.out.println(isTeen(9));  //should return false since 9 is in not range 13 - 19
        System.out.println(isTeen(13));  //should return true since 13 is in range 13 - 19
    }

    //Positive, Negative or Zero
    //Write a method called checkNumber with an int parameter number.
    //The method should not return any value, and it needs to print out:
    //      "positive" if the parameter number is > 0
    //      "negative" if the parameter number is < 0
    //      "zero" if the parameter number is equal to 0

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    // Speed Converter
    //1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
    //If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
    //Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return (Long) (Math.round(kilometersPerHour / 1.609));
        }
    }


    //2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
    //This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
    //Then it needs to print a message in the format "XX km/h = YY mi/h".
    //XX represents the original value kilometersPerHour.
    //YY represents the rounded milesPerHour from the kilometersPerHour parameter.
    //If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometerPerHour + " km/h = " + toMilesPerHour(kilometerPerHour) + " mi/h");
        }
    }


    //MegaBytes Converter
    //Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    //The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

    //Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

    //XX represents the original value kiloBytes.
    //YY represents the calculated megabytes.
    //ZZ represents the calculated remaining kilobytes.
    //For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
    //If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

    //TIP: Be extremely careful about spaces in the printed message.
    //      TIP: Use the remainder operator
    //TIP: 1 MB = 1024 KB
    //NOTE: Do not set kilobytes parameter value inside your method.
    //      NOTE: The solution will not be accepted if there are extra spaces.
    //NOTE: The printMegaBytesAndKiloBytes method  needs to be defined as public static ​like we have been doing so far in the course.
    //NOTE: Do not add a  main method to solution code.

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mega = kiloBytes / 1024;
            int kilo = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mega + " MB and " + kilo + " KB");
        }
    }

    //Barking Dog
    //We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
    //Write a method shouldWakeUp that has 2 parameters.
    //1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    //2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

    //We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

    //In all other cases return false.

    //If the hourOfDay parameter is less than 0 or greater than 23 return false.


    //TIP: Use the if else statement with multiple conditions.
    //NOTE: The shouldWakeUp method  needs to be defined as public static ​like we have been doing so far in the course.
    //NOTE: Do not add a  main method to solution code.

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    //Leap Year Calculator
    //Write a method isLeapYear with a parameter of type int named year.
    //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    //If the parameter is not in that range return false.
    //Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
    //To determine whether a year is a leap year, follow these steps:
    //1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
    //2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
    //3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
    //4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
    //5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

    //The following years are not leap years:
    //1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
    //This is because they are evenly divisible by 100 but not by 400.

    //The following years are leap years:
    //1600, 2000, 2400
    //This is because they are evenly divisible by both 100 and 400.


    //NOTE: The method isLeapYear needs to be defined as public static ​like we have been doing so far in the course.
    //NOTE: Do not add a  main method to solution code.

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }


    //DecimalComparator
    //Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    //The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


    //TIP: Use paper and pencil.
    //TIP: Use casting.
    //NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
    //NOTE: Do not add a  main method to solution code.

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        System.out.println((int) (number1 * 1000) + " " + (int) (number2 * 1000));
        if ((int) (number1 * 1000) == (int) (number2 * 1000)) {
            return true;
        } else {
            return false;
        }
    }

    //Equal Sum Checker
    //Write a method hasEqualSum with 3 parameters of type int.
    //The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.

    //NOTE: The hasEqualSum method  needs to be defined as public static ​like we have been doing so far in the course.
    //NOTE: Do not add a  main method to solution code.

    public static boolean hasEqualSum(int a, int b, int c) {
        if ((a + b) == c) {
            return true;
        } else {
            return false;
        }
    }

//Teen Number Checker
//We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//Write a method named hasTeen with 3 parameters of type int.
//The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

//Write another method named isTeen with 1 parameter of type int.
//The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

//NOTE: All methods need to be defined as public static ​like we have been doing so far in the course.
//NOTE: Do not add a  main method to solution code.

    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int a) {
        if (a >= 13 && a <= 19) {
            return true;
        } else {
            return false;
        }
    }

}
