public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws= (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy= Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();

        var airplane =  Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane 2");
        plane.watchComedy();

        Object unknownObject= Movie.getMovie("S", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }else if (unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchMovie();
        }else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }


    }

}
