import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class PrincipalBusca {
    public static double buscarTaxaConversao(String moedaInserida, String moedaAlvo) throws IOException, InterruptedException {

        String endereco = "https://v6.exchangerate-api.com/v6/504202f97f80daf951bd4fba/latest/" + moedaInserida;

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

        //Biblioteca para mapear os dados JSON
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        MoedaExchangeRate moedas = gson.fromJson(json, MoedaExchangeRate.class);

        Map<String, Double> conversionRates = moedas.conversion_rates();

        if (conversionRates.containsKey(moedaAlvo)) {
            return conversionRates.get(moedaAlvo);
        } else {
            System.out.println("Moeda não encontrada na taxa de conversão.");
            return -1.0;
        }
    }

}
