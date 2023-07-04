import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        int currentYear = 2023;

        try {
            System.out.println(getInputFromScanner(currentYear));
        } catch (Exception e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Hi, What´s your name? ");
        String name= scanner.nextLine();

        System.out.println("Hi " + name + " , thanks for taking the course");

        System.out.println("What year where you born? ");
        String dateOfBirth = scanner.nextLine();

        int age= currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

}
