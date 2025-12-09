//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 01
        ClasseBancaria banco = new ClasseBancaria();
        banco.titular = "Pedro";
        banco.setNumeroConta(12345);
        banco.setSaldo(2500.00);

        System.out.println(banco.titular);
        System.out.println(banco.getNumeroConta());
        System.out.println(banco.getSaldo());

        // 02
        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setNome("Pedro");
        idadePessoa.setIdade(22);

        idadePessoa.verificarIdade();

        // 03
        Produto novoProduto = new Produto();
        novoProduto.setNome("Celular");
        novoProduto.setPreco(2500.00);
        novoProduto.aplicarDesconto(10);

        // 04
        Aluno aluno = new Aluno("Pedro", 8.5, 8.8, 9.8);
        System.out.printf("%.2f\n", aluno.calcularMedia());

        // 05
        Livro livro = new Livro("Harry Potter", "J. K. Rowling");
        livro.exibirDetalhes();
    }
}