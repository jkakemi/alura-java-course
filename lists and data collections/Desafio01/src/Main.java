import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa("Pedro", 22);
//        p1.setNome("Pedro");
//        p1.setIdade(22);
        pessoas.add(p1);
        Pessoa p2 = new Pessoa("Akemi", 21);
//        p2.setNome("Julia");
//        p2.setIdade(21);
        pessoas.add(p2);

        Pessoa p3 = new Pessoa("Mutoni", 42);
        pessoas.add(p3);

        System.out.println("Tam da lista: " + pessoas.size());
        System.out.println("Primeira pessoa: " + pessoas.get(0).toString());
        for(int i = 0; i < pessoas.size(); ++i){
            System.out.println(pessoas.get(i).toString());
        }

    }
}
