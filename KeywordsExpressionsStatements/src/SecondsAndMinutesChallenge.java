public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDuration(3945));

        System.out.println(getDuration(65, 45));
    }

    public static String getDuration(int seconds) {
        if (seconds < 0) {
            return "Invalid Data";
        } else {
            int minutes = seconds / 60;
            seconds = minutes % 60;
            return getDuration(minutes, seconds);
        }
    }

    public static String getDuration(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid Data";
        } else {
            int hours = minutes / 60;
            int segRem = seconds % 60;
            int minRem = minutes % 60;

            return hours + "h " + minRem + "m " + segRem + "s";
        }
    }

}
