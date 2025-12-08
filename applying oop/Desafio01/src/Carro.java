public class Carro {
    String modelo = "Duster";
    int ano = 2016;
    String cor = "Cinza claro";

    void exibeFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    int calculaIdade(){
        return 2023-ano;
    }


}
