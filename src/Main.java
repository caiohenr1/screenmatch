import br.com.alura.screenmatch.calculation.CalculateTimeMarathon;
import br.com.alura.screenmatch.modelos.Anime;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;


public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie();
        Serie serie = new Serie();
        Anime anime = new Anime();
        Anime animeHentai = new Anime();

        movie.setName("Star Wars: Uma nova esperança");
        movie.setReleaseYear(1977);
        movie.setDurationMinutes(20);
        movie.displayTechnicalSheet();

        serie.setName("The walking dead");
        serie.setSeasons(30);
        serie.setDurationMinutes(30);

        anime.setName("One Piece");
        anime.setDurationMinutes(10);




        CalculateTimeMarathon calculateTime = new CalculateTimeMarathon();
        calculateTime.calculateTotalTime(movie);
        calculateTime.calculateTotalTime(serie);
        calculateTime.calculateTotalTime(anime);
        System.out.println(calculateTime.getTotalTime());

    }
}
