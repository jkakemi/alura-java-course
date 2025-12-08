import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 04
        System.out.println("Insira um valor");
        int x = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", x, i, x*i);
        }
    }
}
