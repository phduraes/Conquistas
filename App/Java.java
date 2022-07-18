package App;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Java {

    public static void main(String[] args) {

        // acessar url
        var url = "https://imdb-api.com/en/API/Top250Movies/k_om97iutj";
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).build();
        client.send(request, responseBodyHandler);

    }
}
