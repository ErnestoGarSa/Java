public class SharedDigitExercise {

    public static void main(String[] args) {

        //    EXAMPLE INPUT/OUTPUT:
        System.out.println(hasSharedDigit(12, 23)); //→ should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99)); //→ should return false since 9 is not within the range of 10-99);
        System.out.println(hasSharedDigit(15, 55)); //→ should return true since the digit 5 appears in both numbers);

    }

//    Shared Digit
//    Write a method named hasSharedDigit with two parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

//    NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.
//    NOTE: Do not add a main method to the solution code.

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        int dig11 = num1 % 10;
        int dig12 = num1 / 10;
        int dig21 = num2 % 10;
        int dig22 = num2 / 10;

        if (dig11 == dig21 || dig11 == dig22 || dig12 == dig21 || dig12 == dig22) {
            return true;
        } else {
            return false;
        }
    }
}
