import br.com.alura.screenmatch.modelos.Anime;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;


public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie();
        Serie serie = new Serie();
        Anime anime = new Anime();

        movie.setName("Star Wars: Uma nova esperança");
        movie.setReleaseYear(1977);
        movie.setDurationMinutes(120);
        movie.displayTechnicalSheet();

        serie.setName("Vikings");
        serie.setSeasons(12);
        serie.setActive(false);
        serie.displayTechnicalSheet();

        anime.setName("Inuyasha");
        anime.setAnimeSeassons(12);
        anime.setNumberOfEpisodeos(169);
        anime.displayTechnicalSheet();

    }
}
