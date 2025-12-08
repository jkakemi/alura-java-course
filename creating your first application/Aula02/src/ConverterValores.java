public class ConverterValores {
    public static void main(String[] args){
        double media = 8.7;
        // explicito
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
        // implicito
        int x = 10;
        double y = x;

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);
    }
}
