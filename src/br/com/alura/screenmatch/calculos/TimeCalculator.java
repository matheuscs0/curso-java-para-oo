package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titles;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void inclui(Film film){
//        totalTime += film.getDurationInMinutes() / 60;
//    }
//
//    public void inclui(Serie serie){
//        totalTime += serie.getDurationInMinutes() / 60;
//    }

    public void inclui(Titles titles){
        totalTime += titles.getDurationInMinutes() / 60;
    }

}
