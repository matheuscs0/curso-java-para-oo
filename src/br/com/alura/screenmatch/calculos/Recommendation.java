package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titles;

public class Recommendation {

    public void filter(Classification classification) {
        if(classification.getClassification() >= 4){
            System.out.println("Esta nos preferidos do momento! " + classification.getClassification());
        } else if(classification.getClassification() >= 2){
            System.out.println("Muito bem avaliado! " + classification.getClassification());
        } else {
            System.out.println("Coloque na sua lista para ver depois " + classification.getClassification());
        }
    }

}
