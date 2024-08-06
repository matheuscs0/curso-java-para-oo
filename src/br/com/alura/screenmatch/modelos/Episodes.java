package br.com.alura.screenmatch.modelos;

public class Episodes {
    private int number;
    private String name;
    private Serie serie;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setNumber(int number) {
        this.number= number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
