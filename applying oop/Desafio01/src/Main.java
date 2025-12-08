import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibeOlaMundo();

        Calculadora calc = new Calculadora();
        System.out.println(calc.mostrarDobro(8));

        Musica music = new Musica();
        for(int i = 0; i < 4; i++){
            System.out.println("Informe uma nota: ");
            music.avaliaMusica(sc.nextDouble());
        }

        music.exibeFichaTecnica();
        System.out.println("Média das avaliações: " + music.mediaAvaliacoes());

        sc.close();

        Aluno aluno = new Aluno();
        aluno.insereNome("Julia");
        aluno.insereIdade(21);

        aluno.exibeInformacoes();

        Carro c = new Carro();

        System.out.println("Idade do carro: " + c.calculaIdade());
    }

}
