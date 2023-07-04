public class IfThenElseChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Insert a code segment after the code we´ve just reviewed
        //Set the existing score to 10000
        score = 10000;

        //Set levelCompleted to 8
        levelCompleted = 8;

        //Set bonus to 200
        bonus = 200;

        //Use de the same if condition you want to perform the same calculation, and print ouy the value of the final score variable
        finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

}
