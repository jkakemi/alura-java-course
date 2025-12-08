import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 06
        System.out.println("Informe um valor");
        int x = sc.nextInt();

        int fat = 1;
        for(int i = x; i > 0; i--){
            fat *= i;
        }
        System.out.println(fat);
    }
}
