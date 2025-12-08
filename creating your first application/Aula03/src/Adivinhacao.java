import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = new Random().nextInt(100);
        //int number = 54;
        int i = 5;
        boolean flag = false;
        while(i != 0){
            System.out.println("Insira um valor:");
            int x = sc.nextInt();
            if(x == number){
                System.out.println("Parabéns, você acertou o número: " + number);
                flag = true;
                break;
            }
            else if(x > number){
                System.out.println("O seu número é maior que o esperado!");
            }
            else{
                System.out.println("O seu número é menor que o esperado!");
            }

            i--;
            System.out.println("Número de tentativas restantes: " + i);
        }

        if(!flag){
            System.out.println("Não foi dessa vez! O número sorteado foi: " + number);
        }

    }
}
