public class Challenge {

    public static void main(String[] args) {

        //Step 1: Create a double variable with a value of 20.00
        double a = 20.00;

        //Step 2: Create a second variable with a value of 80.00
        double b = 80.00;

        //Step 3: Add both numbers together, then multiply by 100.00
        double sum = (a + b) * 100.00;
        //Step 4: Use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00 will be.
        double rem = sum % 40.00;

        //Step 5: Create a boolean variable that assigns the value true, ig the remainder in step four is 0.00, or false if it´s not zero
        boolean c = rem == 0.00 ? true : false;

        //Step 6: Output the boolean variable just to see what the result is.
        System.out.println(c);

        //Step 7 Write an if-then statement that displays a message, "got some remainder", if the boolean in step five is not true.
        if (!c) {
            System.out.println("Got some remainder");
        }

    }

}
