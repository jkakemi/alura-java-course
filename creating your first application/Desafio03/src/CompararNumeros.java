import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 02
        System.out.println("Insira o primeiro valor");
        int a = sc.nextInt();
        System.out.println("Insira o segundo valor");
        int b = sc.nextInt();

        if(a == b) System.out.println("São iguais!");
        else System.out.println("São diferentes!");
        if(a > b) System.out.println("O primeiro é maior que o segundo!");
        else System.out.println("O segundo é maior que o primeiro!");
    }
}
