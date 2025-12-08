import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 01
        System.out.println("Insira um número");
        int number = sc.nextInt();
        if(number > 0) System.out.println("Número positivo");
        else System.out.println("Número negativo");

        // 02
        System.out.println("Insira o primeiro valor");
        int a = sc.nextInt();
        System.out.println("Insira o segundo valor");
        int b = sc.nextInt();

        if(a == b) System.out.println("São iguais!");
        else System.out.println("São diferentes!");
        if(a > b) System.out.println("O primeiro é maior que o segundo!");
        else System.out.println("O segundo é maior que o primeiro!");

        // 03

    }
}
