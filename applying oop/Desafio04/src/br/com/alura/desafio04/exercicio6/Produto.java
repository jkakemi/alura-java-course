package br.com.alura.desafio04.exercicio6;

public class Produto implements Vendavel{
    private String nome;
    private double precoUnitario;

    public Produto(double precoUnitario, String nome) {
        this.precoUnitario = precoUnitario;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario*quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario*(percentualDesconto/100.0);
    }
}
