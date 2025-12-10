package br.com.alura.desafio04.exercicio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    double altura;
    double largura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("Área calculada: " + altura*largura);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        System.out.println("Perítmetro calculado: " + 2*(altura+largura));
    }
}
