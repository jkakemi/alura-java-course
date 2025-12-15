import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String senha;
        senha = sc.nextLine();

        try{
            validarSenha(senha);
            System.out.println("Senha válida");
        } catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha){
        if(senha.length() < 8){
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres");
        }
    }
}
