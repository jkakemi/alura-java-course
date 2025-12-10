package br.com.alura.desafio04.exercicio3;

public class TabuadaMultiplicacao implements Tabuada{
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void mostrarTabuada(int number) {
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", number, i, number*i);
        }
    }
}
