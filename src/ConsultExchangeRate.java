import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultExchangeRate {
    public Coin lookRate(String coinName) {
        String id = System.getenv("EXCHANGE_RATE_API_KEY");
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+id+"/latest/"+ coinName);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Coin.class);
        } catch (Exception e) {
            throw new RuntimeException("We did not found this coin");
        }
    }

}
