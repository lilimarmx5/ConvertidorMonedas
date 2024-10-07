import com.google.gson.Gson;

import java.util.HashMap;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


public class busqueda{


    private final Map<String, Double> exchangeRates;
    private String moneda1;
    public String direccion = "https://v6.exchangerate-api.com/v6/ffd3305891a1cc346f64cb01"+ moneda1;


        public busqueda(String busqueda1){ exchangeRates = fetchExchangeRates(busqueda1);
            }
            

        private Map<String, Double> fetchExchangeRates(String busqueda1){
         Map<String, Double> moneda = new HashMap<>();
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                String jsonResponse = response.toString();
                String ratesString = jsonResponse.split("\"rates\":")[1].split("}")[0] + "}";
                HashMap rates = new Gson().fromJson(ratesString, HashMap.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
               
                System.out.println(moneda1);
                System.out.println ("finalizo la ejecucion del programa");
            return moneda;
        }

}






