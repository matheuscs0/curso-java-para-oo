package br.com.alura.screenmatch.modelos;

//extends quer dizer que filme tem tudo que há em titulo ++ coisas add
public class Film extends Titles {
  private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
