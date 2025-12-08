import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 05
        int x = sc.nextInt();
        if(x%2 == 0) System.out.println("É par");
        else System.out.println("É ímpar");
    }
}
