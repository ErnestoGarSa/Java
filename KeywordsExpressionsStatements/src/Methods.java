public class Methods {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println(calculateMyAge(1990));

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateMyAge(int dateOfBirth) {
        return (2023 - dateOfBirth);
    }


}
