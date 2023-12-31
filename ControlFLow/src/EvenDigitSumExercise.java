public class EvenDigitSumExercise {

    public static void main(String[] args) {

        //    EXAMPLE INPUT/OUTPUT:
        System.out.println(getEvenDigitSum(123456789)); //→ should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252)); //→ should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22)); //→ should return -1 since the number is negative

    }

//    Even Digit Sum
//    Write a method named getEvenDigitSum with one parameter of type int called number.
//
//    The method should return the sum of the even digits within the number.
//
//    If the number is negative, the method should return -1 to indicate an invalid value.

//    NOTE: The method getEvenDigitSum ​should be defined as public static like we have been doing so far in the course.
//    NOTE: Do not add a main method to the solution code.

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

}
