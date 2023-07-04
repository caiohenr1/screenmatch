import br.com.alura.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie1 = new Movie();

        myMovie1.setName("O poderoso  chefão");
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

        Movie myMovie2 = new Movie();
        myMovie2.setName("Inuyasha");
        myMovie2.setReleaseYear(1950);
        myMovie2.setDurationMinutes(24);
        myMovie2.setRating(0);



        myMovie2.displayTechnicalSheet();

        myMovie2.AddRatings(1);
        myMovie2.AddRatings(5.4);
        myMovie2.AddRatings(0);
        myMovie2.AddRatings(0);
        myMovie2.AddRatings(1);
        myMovie2.AddRatings(2);
        myMovie2.AddRatings(9);
        myMovie2.AddRatings(10);

        System.out.println(String.format("""
               A média do filme é: %.1f
                """, myMovie2.calcAverageRatings()));
    }
}
