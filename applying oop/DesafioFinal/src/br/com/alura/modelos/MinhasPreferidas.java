package br.com.alura.modelos;

public class MinhasPreferidas {public void inclui(Audio audio) {
    if(audio.getClassificacao() >= 9) {
        System.out.println(audio.getTitulo() + " é de muito sucesso " +
                " e preferido por todos!");
    } else {
        System.out.println(audio.getTitulo() + " também é um dos que todo mundo está " +
                "adorando");
    }
}

}
