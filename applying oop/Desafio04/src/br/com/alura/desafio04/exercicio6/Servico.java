package br.com.alura.desafio04.exercicio6;

public class Servico implements Vendavel{
    private String descricao;
    private double precoHora;

    public Servico(String descricao, double precoHora) {
        this.descricao = descricao;
        this.precoHora = precoHora;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
