import br.com.alura.screenmatch.calculos.TimeCalculator;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film();
        meuFilme.setName("Sev7n");
        meuFilme.setDescription("lalala");
        meuFilme.setDurationInMinutes(200);

        Film outroFilme = new Film();
        outroFilme.setName("Sev7n");
        outroFilme.setDescription("lalala");
        outroFilme.setDurationInMinutes(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        System.out.println(meuFilme.getTotalStars());
        System.out.println(meuFilme.obterMedia());

        Serie serie = new Serie();
        serie.setEpPerSeasons(10);
        serie.setSeasons(7);
        serie.setMinutesPerEp(45);
        System.out.println(serie.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.inclui(meuFilme);
        calculator.inclui(outroFilme);
        calculator.inclui(serie);
        System.out.println(calculator.getTotalTime());

    }
}
