package service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Coins;
import model.CoinsApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServiceCoin {

    public void getResponse(String base_code, String target_code, Double conversion_result) throws IOException, InterruptedException {


        String url = "https://v6.exchangerate-api.com/v6/571c2f2b34e6ec3fb300e8a1/pair/" + base_code + "/" + target_code + "/" + conversion_result;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .join();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        CoinsApi coinsApi = gson.fromJson(json, CoinsApi.class);


        Coins coins = new Coins(coinsApi);

        System.out.println(coins);
    }

}
