public class SystemConsole {

    public static void main(String[] args) {

        int currentYear = 2023;
        String userDateOfBirth = "1990";

        int dateOfBirth = Integer.parseInt(userDateOfBirth);
        System.out.println("Age = " + (currentYear - dateOfBirth));

        System.out.println(getInputFromConsole(2023));
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What´s your name? ");
        System.out.println("Hi " + name + " , thanks for taking the course");

        String dateOfBirth = System.console().readLine("What year where you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }



}
