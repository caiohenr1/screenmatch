import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;


public class Main {
    public static void main(String[] args) {
        Movie myMovie1 = new Movie();
        Serie mySerie = new Serie();

        myMovie1.setName("inuyasha");
        myMovie1.setReleaseYear(1970);
        myMovie1.setDurationMinutes(166);
        myMovie1.setRating(0);



        myMovie1.displayTechnicalSheet();

        myMovie1.AddRatings(5.5);
        myMovie1.AddRatings(2.4);
        myMovie1.AddRatings(9);

        System.out.println(String.format("""
                A média do filme é: %.1f
                """, myMovie1.calcAverageRatings()));


    }
}
