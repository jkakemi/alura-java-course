package br.com.alura.desafio03.modelos.animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("Au Au Auuu");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanando o rabo");
    }
}
