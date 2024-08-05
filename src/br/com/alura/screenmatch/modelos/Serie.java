package br.com.alura.screenmatch.modelos;

public class Serie extends Titles{
    private int seasons;
    private int epPerSeasons;
    private boolean active;
    private int minutesPerEp;

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
}