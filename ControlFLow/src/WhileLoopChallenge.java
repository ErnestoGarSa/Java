public class WhileLoopChallenge {

    public static void main(String[] args) {

        int i = 5;
        int totalEven = 0;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                if (totalEven == 5) {
                    System.out.println("Total even numbers found = " + totalEven);
                    break;
                }
                totalEven++;
                System.out.println(i);
                i++;
            }
            i++;
        }

        System.out.println(sumDigits(-8));
        System.out.println(sumDigits(8));
        System.out.println(sumDigits(84));
        System.out.println(sumDigits(1000));


    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            return sum;
        }

    }


}
