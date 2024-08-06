package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classification;

public class Serie extends Titles implements Classification {
    private int seasons;
    private int epPerSeasons;
    private boolean active;
    private int minutesPerEp;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpPerSeasons() {
        return epPerSeasons;
    }

    public boolean isActive() {
        return active;
    }

    public int getMinutesPerEp() {
        return minutesPerEp;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpPerSeasons(int epPerSeasons) {
        this.epPerSeasons = epPerSeasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setMinutesPerEp(int minutesPerEp) {
        this.minutesPerEp = minutesPerEp;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * epPerSeasons * minutesPerEp;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + " (" + this.getReleaseYear() +") ";
    }

    @Override
    public int getClassification() {
        return (int) obterMedia() / 2;
    }
}