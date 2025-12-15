import java.io.FileWriter;
import java.io.IOException;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {
        String data = "Conteudo do arquivo";

        try(FileWriter escrita = new FileWriter("arquivo.txt")){
            escrita.write(data);
            System.out.println("Dados gravados");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
