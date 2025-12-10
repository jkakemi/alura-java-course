import br.com.alura.desafio03.exercicio2.Animal;
import br.com.alura.desafio03.exercicio2.Cachorro;
import br.com.alura.desafio03.exercicio3.Produto;
import br.com.alura.desafio03.exercicio4.Circulo;
import br.com.alura.desafio03.exercicio4.Forma;
import br.com.alura.desafio03.exercicio4.Quadrado;
import br.com.alura.desafio03.exercicio5.ContaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        ArrayList<Integer> array = new ArrayList<>();
//
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < 10; i++){
//            System.out.println("Informe um valor: ");
//            int x = sc.nextInt();
//            array.add(x);
//        }
//
//        for(Integer a : array){
//            System.out.println(a);
//        }

        //Cachorro cachorro = new Cachorro();
        //Animal animal = (Cachorro) cachorro;

//        System.out.println(animal);
//        System.out.println(cachorro);

        Animal animal = new Cachorro();
        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        } else{
            System.out.println("Nao eh um cachorro");
        }

        Produto produto1 = new Produto("Ar condicionado", 2000.0);
        Produto produto2 = new Produto("Aquecedor", 800.0);
        Produto produto3 = new Produto("Ventilador", 150.0);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(4);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }

        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
    }
}
