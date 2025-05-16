package com.santiagogonzalez.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.santiagogonzalez.records.Conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeValor {
    public Conversor convertirValor(String codigoBase) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6bd8e7b02e661dfe2bd404b4/latest/" + codigoBase);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET() // Estableciendo el método de solicitud
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(response.body(), Conversor.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
