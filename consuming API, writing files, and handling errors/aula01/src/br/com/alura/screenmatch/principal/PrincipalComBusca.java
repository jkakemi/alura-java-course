package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um CEP para busca");
        var busca = sc.nextLine();
        String endereco = "https://viacep.com.br/ws/" + busca + "/json/";

        // client vai fazer esse pedido
        HttpClient client = HttpClient.newHttpClient();
        // request vai dizer para onde é essa requisicao
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
