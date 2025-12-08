public class Musica {
    String titulo = "Dark Horse";
    String artista = "Katy Perry";
    int anoLancamento = 2013;
    double avaliacao;
    int numAvaliacoes;

    void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacao/numAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Soma das Avaliações: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }
}
