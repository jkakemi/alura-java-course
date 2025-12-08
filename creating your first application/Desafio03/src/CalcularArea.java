import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 03
        int op = 0;
        while(op != 3){
            String message = """
                1. Calcular área do quadrado
                2. Calcular área do círculo
                3. Sair
                Escolha uma opção:
                """;
            System.out.println(message);
            op = sc.nextInt();
            if(op == 1){
                double a = sc.nextInt();
                double area = a*a;
                System.out.printf("Área do quadrado é %.2f: ", area);
            }
            else if(op == 2){
                double pi = 3.14;
                double raio = sc.nextInt();
                System.out.printf("Área do círculo é %.2f: ", pi*Math.pow(raio, 2));
            }
            else if(op == 3) System.out.println("Encerrado");
            else System.out.println("Opção inválida");
        }

    }
}
