package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classification;

//extends quer dizer que filme tem tudo que há em titulo ++ coisas add
public class Film extends Titles implements Classification {
    private String director;

    public Film(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ") ";
    }

    @Override
    public int getClassification() {
        return (int) obterMedia() / 2; //cast (int)
    }



}
