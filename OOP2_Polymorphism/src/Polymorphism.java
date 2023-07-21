import java.util.Scanner;

public class Polymorphism {

    public static void main(String[] args) {

//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();
//
//        Movie theAdventure = new Adventure("Indiana Jones");
//        theAdventure.watchMovie();
//
//        Movie theComedy = new Comedy("Ace Ventura");
//        theComedy.watchMovie();
//
//        Movie theSci = new ScienceFiction("Tron");
//        theSci.watchMovie();
//
//        Movie theMovie2 = Movie.getMovie("Science", "Star Wars III");
//        theMovie2.watchMovie();

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit): ");
            String type = s.next().toUpperCase();
            if ("Q".contains(type)) {
                break;
            }
            System.out.println("Enter Movie title: ");
            String title = s.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }


    }

}

class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure!");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy(){
        System.out.println("Watching an Comedy!");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
                "Bad Aliens do bad stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }

    public void watchScienceFiction(){
        System.out.println("Watching an ScienceFiction!");
    }
}

