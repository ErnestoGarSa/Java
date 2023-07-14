public class StringFormating {

    public static void main(String[] args) {


        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age= %d, Birth year = %d", age, yearOfBirth);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        System.out.printf("Your age is %f", (float) age);

        System.out.println("Hellow World");
        PrintInformation("Hello World");
        System.out.println("");
        PrintInformation("");
        System.out.println("    ");
        PrintInformation("    ");

        String string = "Hello World";
        System.out.printf("Index of e = %d %n", string.indexOf("e"));
        System.out.printf("Last Index of l = %d %n", string.lastIndexOf("l"));
        System.out.printf("Index of World = %d %n", string.indexOf("World"));

    }

    public static void PrintInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

}





