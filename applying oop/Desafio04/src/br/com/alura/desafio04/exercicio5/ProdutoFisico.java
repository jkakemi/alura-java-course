package br.com.alura.desafio04.exercicio5;

public class ProdutoFisico extends Produto implements Calculavel {
    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        return preco * 1.05;
    }
}
