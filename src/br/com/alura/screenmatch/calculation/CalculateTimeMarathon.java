package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.modelos.Title;

public class CalculateTimeMarathon {

    private int totalTime = 0;

    public double getTotalTime() {
        return this.totalTime;
    }

    public void calculateTotalTime(Title title) {
        this.totalTime = totalTime + title.getDurationMinutes();
    }
}
