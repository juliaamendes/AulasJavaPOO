package com.senai.aula06_abstracao.exemplos.Animais;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Touby");
        cachorro.dormir();
        gato.dormir();

        cachorro.fazerSom();
        gato.fazerSom();
    }


}