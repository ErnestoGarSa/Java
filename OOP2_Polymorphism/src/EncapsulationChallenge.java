//public class EncapsulationChallenge {
//
//    public static void main(String[] args) {
//        Printer printer = new Printer(50, true);
//
//        System.out.println("Initial page count = " + printer.getPagesPrinted());
//
//        int pagesPrinted = printer.printPages(5);
//        System.out.printf("Current job pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
//
//         pagesPrinted = printer.printPages(10);
//        System.out.printf("Current job pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
//    }
//
//}
//
//class Printer {
//    private int tonerLevel;
//    private int pagesPrinted;
//    private boolean duplex;
//
//    public Printer(int tonerLevel, boolean duplex) {
//        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
//        this.duplex = duplex;
//        this.pagesPrinted = 0;
//    }
//
//    public int addToner(int tonerAmount) {
//        int tempAmount = tonerAmount + tonerLevel;
//        if (tempAmount < 0 || tempAmount > 100) {
//            return -1;
//        }
//        tonerLevel += tonerAmount;
//        return tonerLevel;
//    }
//
//    public int printPages(int pages) {
//        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
//        pagesPrinted += jobPages;
//        return jobPages;
//    }
//
//    public int getPagesPrinted() {
//        return pagesPrinted;
//    }
//}
