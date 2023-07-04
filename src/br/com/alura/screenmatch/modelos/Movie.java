package br.com.alura.screenmatch.modelos;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean premiumUser;
    private double rating;
    private int totalRatings;
    private int durationMinutes;

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPremiumUser() {
        return premiumUser;
    }

    public double getRating() {
        return rating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPremiumUser(boolean premiumUser) {
        this.premiumUser = premiumUser;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void displayTechnicalSheet () {
        System.out.println(String.format("""
                Filme: %s
                Ano de lancamento: %d
                """, name, releaseYear));
    }

    public void AddRatings(double note) {
        rating = rating + note;
        totalRatings++;
    }

    public double calcAverageRatings () {
        return  rating / totalRatings;
    }
}
