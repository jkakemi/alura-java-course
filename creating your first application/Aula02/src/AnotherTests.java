public class AnotherTests {
    public static void main(String[] args){
        String senha = "12345";
        if(senha.equals(12345)){
            System.out.println("Acesso autorizado!");
        }
        else{
            System.out.println("Senha incorreta.");
        }

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais\n", nome, idade, valor);

        String nome2 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);

        System.out.println(mensagem);
    }
}
