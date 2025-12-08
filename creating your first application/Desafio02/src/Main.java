public class Main {
    public static void main(String[] args) {
        // 01
        double nota1 = 9.6;
        double nota2 = 8.3;
        double media = (nota1+nota2)/2;
        System.out.println(media);

        // 02
        double x = 7.5;
        int y = (int) x;
        System.out.println(y);

        // 03
        char letter = 'X';
        String word = " Desafio number two";
        System.out.println(letter + word);

        // 04
        double precoProduto = 6.50;
        int quantidade = 3;

        System.out.printf("Valor total: %.2f\n", precoProduto*quantidade);

        // 05
        double valorEmDolares = 5.00;
        double valorConvertidoEmReais = valorEmDolares*4.94;
        System.out.printf("Tenho %.2f dólares e convertido em reais é: %.2f\n", valorEmDolares, valorConvertidoEmReais);

        // 06
        double precoOriginal = 550.00;
        double percentualDesconto = 15.00;

        double desconto = (percentualDesconto/100.00)*precoOriginal;
        double precoComDesconto = precoOriginal - ((precoOriginal*percentualDesconto)/100.00);

        System.out.printf("Preço original: %.2f, Desconto: %.2f e Preço com desconto: %.2f\n", precoOriginal, desconto, precoComDesconto);
    }
}