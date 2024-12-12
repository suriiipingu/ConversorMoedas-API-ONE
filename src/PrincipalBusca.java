import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma moeda.");
        var busca = leitura.nextLine();

        String endereco = "https://v6.exchangerate-api.com/v6/504202f97f80daf951bd4fba/latest/" + busca;

        //Cliente para solicitações à API de taxas de câmbio
        HttpClient client = HttpClient.newHttpClient();

        //Requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        //Gerenciar respotas recebidas da API
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        System.out.println(json);

        //Biblioteca para mapear os dados JSON
        Gson gson = new Gson();
//        gson.fromJson();
    }
}
