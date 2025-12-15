import com.google.gson.Gson;

public class Exercicio4 {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public Exercicio4() {

    }

    public static void main(String[] args) {
        Exercicio4 carro = new Exercicio4();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAnoFabricacao(2022);
        carro.setPreco(75000.00);

        Gson gson = new Gson();
        String jsonVeiculo = gson.toJson(carro);

        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(jsonVeiculo);
    }
}
