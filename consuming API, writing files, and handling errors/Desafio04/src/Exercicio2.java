import com.google.gson.Gson;

public class Exercicio2 {
    String nomeTitulo;
    String autorTitulo;

    public static void main(String[] args){
        Exercicio2 titulo = new Exercicio2();
        titulo.nomeTitulo = "Novela 1";
        titulo.autorTitulo = "Autor 1";
        Gson gson = new Gson();
        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
