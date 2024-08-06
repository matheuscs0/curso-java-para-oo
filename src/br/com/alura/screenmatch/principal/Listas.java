package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titles;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        Film meuFilme = new Film("Sev7n", 1995);
        meuFilme.avalia(10);
        Film outroFilme = new Film("Sexto Sentido", 1999);
        outroFilme.avalia(9);
        Serie serie = new Serie("Peaky Blinders", 2013);
        Film filmeDoTh = new Film("Os outros", 2001);
        filmeDoTh.avalia(8);

        Film film1 = filmeDoTh;

        List<Titles> lista = new LinkedList<>();
        lista.add(filmeDoTh);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);

        // para cada item da lsista dar um pritnln
        // maniera mais facil lista.forEach(item -> System.out.println(item));
        for (Titles item: lista){
            System.out.println(item);
            if (item instanceof Film filme){
                System.out.println("Classificação " + filme.getClassification());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Brad Pitt");
        buscaPorArtista.add("Anthony Hopkins");
        buscaPorArtista.add("Leonardo Di Caprio");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("ordenada por nome" + lista);
        lista.sort(Comparator.comparing(Titles::getReleaseYear));
        System.out.println("ordenada por ano " + lista);
    }

}
