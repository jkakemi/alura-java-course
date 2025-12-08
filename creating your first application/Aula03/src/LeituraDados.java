import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = sc.nextLine();
        System.out.println("Qual ano de lançamento?");
        int anoDeLancamento = sc.nextInt();
        System.out.println("Qual sua nota?");
        double avaliacao = sc.nextDouble();
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.printf("%.2f", avaliacao);

        sc.close();
    }
}
