package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.Recommendation;
import br.com.alura.screenmatch.calculos.TimeCalculator;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film("Sev7n", 1995);
//        meuFilme.setName("Sev7n");
        meuFilme.setDescription("lalala");
        meuFilme.setDurationInMinutes(200);

        Film outroFilme = new Film("Sexto Sentido", 1999);
//        outroFilme.setName("Sexto Sentido");
        outroFilme.setDescription("lalala");
        outroFilme.setDurationInMinutes(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        System.out.println(meuFilme.getTotalStars());
        System.out.println(meuFilme.obterMedia());

        Serie serie = new Serie("Peaky Blinders", 2013);
        serie.setEpPerSeasons(10);
        serie.setSeasons(7);
        serie.setMinutesPerEp(45);
        System.out.println(serie.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.inclui(meuFilme);
        calculator.inclui(outroFilme);
        calculator.inclui(serie);
        System.out.println(calculator.getTotalTime());

        Recommendation filter = new Recommendation();
        filter.filter(meuFilme);

        var filmeDoTh = new Film("Os outros", 2001);
        //filmeDoTh.setName("Os outros");
        filmeDoTh.setDescription("lalala");
        filmeDoTh.setDurationInMinutes(180);

        ArrayList<Film> listaDeFilms = new ArrayList<>();
        listaDeFilms.add(filmeDoTh);
        listaDeFilms.add(meuFilme);
        listaDeFilms.add(outroFilme);
        System.out.println("Tamnho " + listaDeFilms.size());
        System.out.println("1 filme " + listaDeFilms.get(0).getName());
        System.out.println(listaDeFilms);
    }
}
