package br.com.alura.desafio04.exercicio1;

public class ConversorMoeda implements ConversaoFinanceira{
    private double dolar;

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getDolar() {
        return dolar;
    }

    @Override
    public void converterDolarParaReal(double valorDolar) {
        System.out.println("O valor em reais é R$" + valorDolar*4.80);
    }
}
