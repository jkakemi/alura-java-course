import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Exercicio3 {
    String nomeTitulo;
    String autorTitulo;

    public static void main(String[] args){
        Exercicio3 titulo = new Exercicio3();
        titulo.nomeTitulo = "Novela 1";
        titulo.autorTitulo = "Autor 1";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
