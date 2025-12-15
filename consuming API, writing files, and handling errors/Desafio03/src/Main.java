import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 01
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero");
        b = sc.nextInt();

        int x;
        try{
            x = a/b;
            System.out.println(x);
        }
        catch (Exception e){
            System.out.println("Falhou");
            System.out.println(e.getMessage());
        }
    }
}
