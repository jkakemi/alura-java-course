package br.com.alura.desafio04.exercicio5;

public class Livro extends Produto implements Calculavel {
    private String autor;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
