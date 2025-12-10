package br.com.alura.desafio03.exercicio4;

public class Quadrado implements Forma {
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}