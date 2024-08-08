package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exceptions.ErroDeAnoInvalidoException;
import com.google.gson.annotations.SerializedName;

public class Titles implements Comparable<Titles>{
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double stars;
    private int totalStars;
    private String description;
    private int durationInMinutes;

    public Titles(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Titles(TitleOMDB mytitlesOMDB) {
        this.name = mytitlesOMDB.title();
       if (mytitlesOMDB.year().length() > 4){
           throw new ErroDeAnoInvalidoException("Não consegui converter o ano, mais de 4 caracteres");
       }
        this.releaseYear = Integer.valueOf(mytitlesOMDB.year());
        this.durationInMinutes = Integer.valueOf(mytitlesOMDB.runtime().substring(0,3));
        this.description = mytitlesOMDB.plot();

    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public double getStars() {
        return stars;
    }

    public int getTotalStars(){
        return totalStars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getDescription() {
        return description;
    }

    public void exibeFichaTecnica(){
        System.out.println(name);
        System.out.println(releaseYear);
        System.out.println("Incluido no plano :" + includedInPlan);
        System.out.println(stars);
        System.out.println(totalStars);
        System.out.println(durationInMinutes);
    }

    public void avalia(double nota){
        stars += nota;
        totalStars++;
    }

    public double obterMedia() {
        return stars / totalStars;
    }

    @Override
    public int compareTo(Titles otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return
                "( name = " + name + '\'' +
                ", releaseYear = " + releaseYear +
                ')';
    }
}
