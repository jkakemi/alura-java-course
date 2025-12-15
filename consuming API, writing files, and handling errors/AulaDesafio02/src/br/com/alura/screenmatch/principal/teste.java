package br.com.alura.screenmatch.principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Pessoa(String nome, int idade, String cidade) {}

public class teste {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
