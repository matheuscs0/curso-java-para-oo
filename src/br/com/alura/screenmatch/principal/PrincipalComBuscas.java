package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exceptions.ErroDeAnoInvalidoException;
import br.com.alura.screenmatch.modelos.TitleOMDB;
import br.com.alura.screenmatch.modelos.Titles;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reading = new Scanner(System.in);
        String resReading = "";
        List<Titles> titles = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!resReading.equalsIgnoreCase("sair")) {
            System.out.println("Qual filme você quer buscar?");
            resReading = reading.nextLine();

            if(resReading.equalsIgnoreCase("sair")){
                break;
            }

            String url = "https://www.omdbapi.com/?t=" + resReading.replace(" ", "+") + "&apikey=a554d3f6&";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
                String res = response.body();
                System.out.println(res);

                TitleOMDB MytitlesOMDB = gson.fromJson(res, TitleOMDB.class);
                System.out.println("Titulo: " + MytitlesOMDB);

                Titles myTitle = new Titles(MytitlesOMDB);
                System.out.println(myTitle);

                titles.add(myTitle);
            } catch (NumberFormatException e) {
                System.out.println("Error : " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error na busca: " + e.getMessage());
            } catch (ErroDeAnoInvalidoException e) {
                System.out.println("Error no ano: " + e.getMessage());
            }
            System.out.println(titles);
            FileWriter escrita = new FileWriter("filmes.json");
            escrita.write(gson.toJson(titles));
            escrita.close();
        }
    }
}
