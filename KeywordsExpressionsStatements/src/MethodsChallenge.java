public class MethodsChallenge {

    public static void main(String[] args) {

        System.out.println(displayHighScore(2, "Ernesto"));
        System.out.println(displayHighScore(1, "ALberto"));


        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScorePosition(25));
    }
    //Create two methods
    //The first method should be named displayHighScore
    //This method should have two parameters, one for a player´s name, and one for a player´s position in a high score list
    //This method should print a message like "Tim managed to get into position 2 on the high score list"
    //The second method should be named calculateHighScorePosition
    //This method should have only one parameter, the player´s score
    //This method should return a number between 1 and 4 based on the score values
    //Score >= 1000 --> 1
    //Score >= 500 && score < 1000 --> 2
    //Score >= 100 && score < 500 -->
    //Else --> 4
    //Call both methods and display the results for the following scores: 1500, 1000, 500, 10, 25

    public static String displayHighScore(int position, String name) {
        return name + " managed to get into position " + position;
    }

    public static int calculateHighScorePosition(double score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }


}
