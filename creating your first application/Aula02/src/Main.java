public class Main{
    public static void main(String[] args){
        // aula 02
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        if(incluidoNoPlano){
            System.out.println("Sim!");
            System.out.println("Nota do Filme: " + notaDoFilme);
        }
        else{
            System.out.println("Não!");
            System.out.println("Nota do Filme: " + notaDoFilme);
        }

        // aula 06
        // Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        //System.out.println(media);
        System.out.printf("%.2f\n", media);

        /*String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);*/
        String sinopse2;
        sinopse2 = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse2);
    }
}