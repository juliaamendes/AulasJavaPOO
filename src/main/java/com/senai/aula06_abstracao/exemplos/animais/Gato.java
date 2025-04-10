package com.senai.aula06_abstracao.exemplos.Animais;

public class Gato extends Animal{
    Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome+ " diz MIAU");
    }
}
