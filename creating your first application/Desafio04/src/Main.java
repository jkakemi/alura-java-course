import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        String tipoConta = sc.nextLine();
        double saldoInicial = sc.nextDouble();

        System.out.println("****************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.printf("Saldo inicial: %.2f\n", saldoInicial);
        System.out.println("****************");

        int op = 0;
        while(op != 4){
            System.out.println("1. Consultar saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.println("Digite a opção desejada:");

            op = sc.nextInt();
            if(op == 1){
                System.out.println("Saldo atual: " + saldoInicial);
            }
            else if(op == 2){
                System.out.println("Informe o valor a receber:");
                double valor = sc.nextDouble();
                saldoInicial += valor;
                System.out.println("Saldo atualizado R$ " + saldoInicial);
            }
            else if(op == 3){
                System.out.println("Informe o valor que deseja transferir:");
                double valor = sc.nextDouble();
                if(valor > saldoInicial){
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                }
                else{
                    saldoInicial -= valor;
                    System.out.println("Saldo atualizado R$ " + saldoInicial);
                }

            }
            else if(op == 4){
                System.out.println("Saindo da conta...");
            }
            else{
                System.out.println("Opção inválida");
            }
        }

    }
}
