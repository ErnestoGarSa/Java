public class SwitchStatement {

    public static void main(String[] args) {

//        int switchValue = 1;
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//        case 3: case 4: case 5:
//            System.out.println("Was a 3, a 4, a 5");
//            default:
//                System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 2;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> System.out.println("Was a 3, a 4, a 5");
            default -> System.out.println("Value was not 1 or 2");
        }

        System.out.println(getQuarter("MARCH"));

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }


}
