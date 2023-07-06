package br.com.alura.screenmatch.modelos;

public class Serie extends Title{

    private int seasons;
    private boolean active;
    private int episodesBySeasons;
    private double minutesPerEpisode;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesBySeasons() {
        return episodesBySeasons;
    }

    public void setEpisodesBySeasons(int episodesBySeasons) {
        this.episodesBySeasons = episodesBySeasons;
    }

    public double getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(double minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public void displayTechnicalSheet() {
        System.out.println(String.format("""
                Série: %s
                Temporadas: %d
                """,getName(), getSeasons()));
    }
}
