package br.com.alura.screenmatch.modelos;

public class Anime extends Title {

    private String plataform;
    private int animeSeassons;
    private int numberOfEpisodeos;

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public int getAnimeSeassons() {
        return animeSeassons;
    }

    public void setAnimeSeassons(int animeSeassons) {
        this.animeSeassons = animeSeassons;
    }

    public int getNumberOfEpisodeos() {
        return numberOfEpisodeos;
    }

    public void setNumberOfEpisodeos(int numberOfEpisodeos) {
        this.numberOfEpisodeos = numberOfEpisodeos;
    }

    @Override
    public void displayTechnicalSheet() {
        System.out.println(String.format("""
                Anime: %s
                Temporadas: %d
                Episódios: %d
                """,getName(), getAnimeSeassons(), getNumberOfEpisodeos()));
    }
}
