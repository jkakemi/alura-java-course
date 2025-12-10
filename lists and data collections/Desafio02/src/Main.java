import br.com.alura.desafio02.exercicio1.Produto;
import br.com.alura.desafio02.exercicio1.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto("Celular", 3500.0, 10);
        Produto p2 = new Produto("Garrafa Térmica", 170.0, 20);
        Produto p3 = new Produto("Mouse", 50.0, 35);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        System.out.println("Tam da lista: " + produtos.size());
        System.out.println("Indice de um produto: " + produtos.get(0).getNome());

        for(Produto p : produtos){
            System.out.println(produtos);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto teste", 120.0, 10, "22-01-2022");
        System.out.println(produtoPerecivel);
    }
}
