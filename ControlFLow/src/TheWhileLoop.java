public class TheWhileLoop {


    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 5) {
            System.out.println(counter);
            counter++;
        }

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        int i= 5;
        while(i<= 20){
            if (isEvenNumber(i)){
                System.out.println(i);
                i++;
            }
            i++;
        }
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

}
